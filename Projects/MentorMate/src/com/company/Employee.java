package com.company;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Employee implements Serializable {
    String name;
    int totalSales;
    int salesPeriod;
    double experienceMultiplier;



    public Employee()
    {

    }
    public Employee(String name, int totalSales, int salesPeriod, double experienceMultiplier)
    {
        this.experienceMultiplier = experienceMultiplier;
        this.name = name;
        this.salesPeriod = salesPeriod;
        this.totalSales = totalSales;

    }


    public double getExperienceMultiplier() {
        return experienceMultiplier;
    }

    public int getSalesPeriod() {
        return salesPeriod;
    }

    public int getTotalSales() {
        return totalSales;
    }

    public String getName() {
        return name;
    }

    public void setExperienceMultiplier(double experienceMultiplier) {
        this.experienceMultiplier = experienceMultiplier;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalesPeriod(int salesPeriod) {
        this.salesPeriod = salesPeriod;
    }

    public void setTotalSales(int totalSales) {
        this.totalSales = totalSales;
    }

    @Override
    public String toString() {
        return "Data:\n{\n" +
                " name:'" + name + '\'' +
                ",\n totalSales:" + totalSales +
                ",\n salesPeriod:" + salesPeriod +
                ",\n experienceMultiplier:" + experienceMultiplier + "\n" +
                "}\n";
    }
}
