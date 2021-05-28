package com.company;

import java.io.Serializable;

public class Employee implements Serializable {
    String name;
    Long totalSales;
    Long salesPeriod;
    double experienceMultiplier;



    public Employee()
    {

    }
    public Employee(String name, Long totalSales, Long salesPeriod, double experienceMultiplier)
    {
        this.experienceMultiplier = experienceMultiplier;
        this.name = name;
        this.salesPeriod = salesPeriod;
        this.totalSales = totalSales;

    }


    public double getExperienceMultiplier() {
        return experienceMultiplier;
    }

    public Long getSalesPeriod() {
        return salesPeriod;
    }

    public Long getTotalSales() {
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

    public void setSalesPeriod(Long salesPeriod) {
        this.salesPeriod = salesPeriod;
    }

    public void setTotalSales(Long totalSales) {
        this.totalSales = totalSales;
    }

    @Override
    public String toString() {
        return "Employee:\n{\n" +
                " name:'" + name + '\'' +
                ",\n totalSales:" + totalSales +
                ",\n salesPeriod:" + salesPeriod +
                ",\n experienceMultiplier:" + experienceMultiplier + "\n" +
                "}\n";
    }
}
