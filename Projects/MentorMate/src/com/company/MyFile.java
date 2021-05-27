package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MyFile {


    public void WriteEmployeeToFile(String filepath, Employee employee)
    {
        try {
            File file = new File(filepath);
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
            FileWriter myWriter = new FileWriter(filepath,true);
            myWriter.write(employee.toString());
            myWriter.flush();
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }


    public void WriteReportToFile( String filepath, Report report) throws IOException {
        try {
            File file = new File(filepath);
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
            FileWriter myWriter = new FileWriter(filepath,true);
            myWriter.write(report.toString());
            myWriter.flush();
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public void MakeACSVFile(String filepath, List<List<String>> myEmployeesData) throws IOException {
        File file = new File(filepath);
        FileWriter csvWriter = new FileWriter(filepath,true);
        if (file.createNewFile()) {
            System.out.println("File created: " + file.getName());
            csvWriter.append("Name");
            csvWriter.append(",");
            csvWriter.append("Score");
            csvWriter.append("\n");
        } else {
            System.out.println("File already exists.");
        }

        for (List<String> rowData : myEmployeesData) {
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
            if (report.useExperienceMultiplier) {
                reportList.add(employee.getName());
                result = ((employee.totalSales / employee.salesPeriod) * employee.experienceMultiplier);
                if(result <= report.topPerformanceTreshold) {
                    reportList.add(Double.toString(result));
                }
            } else {
                reportList.add(employee.getName());
                result = employee.totalSales / employee.salesPeriod;
                if(result <= report.topPerformanceTreshold) {
                    reportList.add(Double.toString(result));
                }
            }
        }
        return reportList;
    }
}

