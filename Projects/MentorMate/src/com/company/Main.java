package com.company;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);



        List<List<String>> myEmployees = new ArrayList<>();

        String filepath1 = "D:\\SchoolParent\\SpringJava\\Projects\\MentorMate\\employees.json";


        MyFile myFile = new MyFile();


/*      myEmployees.add(myFile.GenerateReport(report,Ivan));
        myEmployees.add(myFile.GenerateReport(report1,Gosho));

        myFile.MakeACSVFile(filepath1, myEmployees);*/
        myFile.ReadFromFile(filepath1);
        myFile.CreateEmployeeFromFile(filepath1);



    }


}
