package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

    ReportGenerator myFile = new ReportGenerator();
        Scanner scanner = new Scanner(System.in);
String filepath = scanner.nextLine();
String filepath1 = scanner.nextLine();
   myFile.createEmployeeFromFile(filepath);

   myFile.MakeACSVFile(filepath1);

    }


}