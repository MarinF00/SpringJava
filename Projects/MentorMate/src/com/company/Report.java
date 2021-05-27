package com.company;

import java.io.Serializable;

public class Report implements Serializable {

    int topPerformanceTreshold;
    boolean useExperienceMultiplier;
    int periodLimit;

    public Report()
    {

    }
    public Report(int topPerformanceTreshold, boolean useExperienceMultiplier, int periodLimit)
    {
        this.periodLimit = periodLimit;
        this.topPerformanceTreshold = topPerformanceTreshold;
        this.useExperienceMultiplier = useExperienceMultiplier;
    }

    public boolean isUseExperienceMultiplier() {
        return useExperienceMultiplier;
    }

    public int getPeriodLimit() {
        return periodLimit;
    }

    public int getTopPerformanceTreshold() {
        return topPerformanceTreshold;
    }

    public void setPeriodLimit(int periodLimit) {
        this.periodLimit = periodLimit;
    }

    public void setTopPerformanceTreshold(int topPerformanceTreshold) {
        this.topPerformanceTreshold = topPerformanceTreshold;
    }

    public void setUseExperienceMultiplier(boolean useExperienceMultiplier) {
        this.useExperienceMultiplier = useExperienceMultiplier;
    }

    @Override
    public String toString() {
        return "Report definition: \n{\n" +
                " topPerformanceTreshold:" + topPerformanceTreshold +
                ",\n useExperienceMultiplier:" + useExperienceMultiplier +
                ",\n periodLimit:" + periodLimit + "\n" +
                '}';
    }
}
