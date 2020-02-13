package com.TW.timeCard.models;

import org.hibernate.validator.constraints.Length;

import javax.persistence.Embedded;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.Date;

public class TimeCard {
//    @NotEmpty(message = "Project should not be empty.")
    private String project;
//    @NotEmpty(message = "SubProject should not be empty.")
    private String subProject;
//    @NotEmpty(message = "Location should not be empty.")
    private String location;
//    @NotEmpty(message = "StartDate should not be empty")
    private Date startDate;
    @Embedded
    private WeekTime weekTime;
//    @NotEmpty(message = "billable should not be empty")
    private boolean billable;
//    @Length(max = 100)
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

    public boolean checkProject(){
        return this.project.isEmpty();
    }

    public boolean checkSubProject(){
        return this.subProject.isEmpty();
    }

    public boolean checkLocation(){
        return this.location.isEmpty();
    }

    public boolean checkStartDate(){
        return this.startDate.toString().isEmpty();
    }

    public boolean checkWeekTime(){
        return !this.weekTime.getCheckDayResult();
    }

    public boolean checkBillable(){
        return String.valueOf(this.billable).isEmpty();
    }
    
    public boolean checkComment(){
        return this.comment.length() > 100;
    }
    
    public ArrayList<String> checkTimeCard(){
        ArrayList<String> res = new ArrayList<>();
        if (checkProject()){
            res.add("Project should not be empty");
        }
        if (checkSubProject()){
            res.add("Sub project should not be empty");
        }
        if (checkBillable()){
            res.add("Billable should not be empty");
        }
        if (checkStartDate()){
            res.add("Start Date should not be empty");
        }
        if (checkComment()){
            res.add("Comment should not longer than 100");
        }
        if (checkLocation()){
            res.add("Location should not be empty");
        }
        if (checkWeekTime()){
            for (String dayInfo:this.weekTime.invalidationDay()) {
                res.add(dayInfo);
            }
        }
        return res;
    }

    public boolean checkResult(){
        return checkTimeCard().size() ==0;
    }
}
