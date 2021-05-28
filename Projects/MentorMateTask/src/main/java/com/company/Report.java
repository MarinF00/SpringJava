package com.company;

import java.io.Serializable;

public class Report implements Serializable {

    Long topPerformanceTreshold;
    boolean useExperienceMultiplier;
    Long periodLimit;

    public Report()
    {

    }
    public Report(Long topPerformanceTreshold, boolean useExperienceMultiplier, Long periodLimit)
    {
        this.periodLimit = periodLimit;
        this.topPerformanceTreshold = topPerformanceTreshold;
        this.useExperienceMultiplier = useExperienceMultiplier;
    }

    public boolean isUseExperienceMultiplier() {
        return useExperienceMultiplier;
    }

    public Long getPeriodLimit() {
        return periodLimit;
    }

    public Long getTopPerformanceTreshold() {
        return topPerformanceTreshold;
    }

    public void setPeriodLimit(Long periodLimit) {
        this.periodLimit = periodLimit;
    }

    public void setTopPerformanceTreshold(Long topPerformanceTreshold) {
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
