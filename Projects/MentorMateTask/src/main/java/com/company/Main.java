package com.company;

public class Main {

    public static void main(String[] args) throws Exception {

    MyFile myFile = new MyFile();

   myFile.createEmployeeFromFile();

   myFile.MakeACSVFile("myCSV.txt");

    }


}