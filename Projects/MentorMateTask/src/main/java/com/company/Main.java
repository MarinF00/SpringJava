package com.company;

public class Main {

    public static void main(String[] args) throws Exception {

    ReportGenerator myFile = new ReportGenerator();

   myFile.createEmployeeFromFile();

   myFile.MakeACSVFile("myCSV.txt");

    }


}