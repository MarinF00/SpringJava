package com.company;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        List<List<String>> myEmployees = new ArrayList<>();

        String filepath1 = sc.nextLine();

        MyFile myFile = new MyFile();



        Employee Ivan = new Employee("Ivan",250,10,0.5);
        Employee Gosho = new Employee("Gosho",250,10,0.5);
        Report report = new Report(10,false,10);
        Report report1 = new Report(10,true,10);

/*      myEmployees.add(myFile.GenerateReport(report,Ivan));
        myEmployees.add(myFile.GenerateReport(report1,Gosho));

        myFile.MakeACSVFile(filepath1, myEmployees);*/
        myFile.ReadFromFile(filepath1);


    }


}
