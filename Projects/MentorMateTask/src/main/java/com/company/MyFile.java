package com.company;

import netscape.javascript.JSObject;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.*;
import java.util.*;

public class MyFile {

    List<List<String>> myEmployees = new ArrayList<>();

    public Object readJsonSimpleDemo(String filename) throws Exception {

        FileReader reader = new FileReader(filename);
        JSONParser jsonParser = new JSONParser();
        return jsonParser.parse(reader);
    }

    public void createEmployeeFromFile() throws Exception {
        JSONArray jsonArray = (JSONArray) readJsonSimpleDemo("employees.json");
        for (int i = 0; i < jsonArray.size(); i++) {
            JSONObject jsonObject = (JSONObject) jsonArray.get(i);
            String name = (String) jsonObject.get("name");
            Long totalSales = (Long) jsonObject.get("totalSales");
            Long salesPeriod = (Long) jsonObject.get("salesPeriod");
            Double experienceMultiplier = (Double) jsonObject.get("experienceMultiplier");
            Employee employee = new Employee(name,totalSales,salesPeriod,experienceMultiplier);
            myEmployees.add(GenerateReport(createReportFromFile(),employee));

            System.out.println(myEmployees);
        }
    }

    public Report createReportFromFile() throws Exception {


        JSONObject jsonObject = (JSONObject) readJsonSimpleDemo("reports.json");
        Report report = new Report(
                (Long) jsonObject.get("topPerformersThreshold"),
                (Boolean) jsonObject.get("useExprienceMultiplier"),
                (Long) jsonObject.get("periodLimit"));

        System.out.println(report);
        return report;
        }

    public void MakeACSVFile(String filepath) throws IOException {
        File file = new File(filepath);
        FileWriter csvWriter = new FileWriter(filepath,true);

            csvWriter.append("Name");
            csvWriter.append(",");
            csvWriter.append("Score");
            csvWriter.append("\n");


        for (List<String> rowData : this.myEmployees) {
            csvWriter.append(String.join(",", rowData));
            csvWriter.append("\n");
        }

        csvWriter.flush();
        csvWriter.close();


    }

    public List<String> GenerateReport(Report report, Employee employee)
    {
        double result = 0;
        List<String> reportList = new ArrayList<>();
        if(employee.salesPeriod <= report.periodLimit) {
            if (!report.useExperienceMultiplier) {
                reportList.add(employee.getName());
                result = ((employee.totalSales / employee.salesPeriod) * employee.experienceMultiplier);
                if(result >= report.topPerformanceTreshold) {
                    reportList.add(Double.toString(result));
                }
            } else {
                reportList.add(employee.getName());
                result = employee.totalSales / employee.salesPeriod;
                if(result >= report.topPerformanceTreshold) {
                    reportList.add(Double.toString(result));
                }
            }
        }
        return reportList;
    }

}

