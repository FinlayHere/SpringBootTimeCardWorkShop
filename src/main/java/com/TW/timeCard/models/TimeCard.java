package com.TW.timeCard.models;

import java.util.Date;

public class TimeCard {
    private String project;
    private String subProject;
    private String location;
    private Date startDate;
    private WeekTime weekTime;
    private boolean billable;
    private String comment;

    public TimeCard() {
    }

    public TimeCard(String project, String subProject, String location, Date startDate, WeekTime weekTime, boolean billable, String comment) {
        this.project = project;
        this.subProject = subProject;
        this.location = location;
        this.startDate = startDate;
        this.weekTime = weekTime;
        this.billable = billable;
        this.comment = comment;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getSubProject() {
        return subProject;
    }

    public void setSubProject(String subProject) {
        this.subProject = subProject;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public WeekTime getWeekTime() {
        return weekTime;
    }

    public void setWeekTime(WeekTime weekTime) {
        this.weekTime = weekTime;
    }

    public boolean isBillable() {
        return billable;
    }

    public void setBillable(boolean billable) {
        this.billable = billable;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
