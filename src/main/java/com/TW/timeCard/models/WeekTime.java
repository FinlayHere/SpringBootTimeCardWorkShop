package com.TW.timeCard.models;

//import javax.validation.constraints.Max;
//import javax.validation.constraints.Min;
//import javax.validation.constraints.NotEmpty;
//import javax.validation.constraints.Size;
import java.util.ArrayList;

public class WeekTime {
//    @NotEmpty(message = "Monday is empty")
//    @Size(min = 0, max = 8, message = "Monday hours should from 0 to 8")
    private int Monday;
//    @NotEmpty(message = "Tuesday is empty")
//    @Size(min = 0, max = 8, message = "Tuesday hours should from 0 to 8")
    private int Tuesday;
//    @NotEmpty(message = "Wednesday is empty")
//    @Size(min = 0, max = 8, message = "Wednesday hours should from 0 to 8")
    private int Wednesday;
//    @NotEmpty(message = "Thursday is empty")
//    @Size(min = 0, max = 8, message = "Thursday hours should from 0 to 8")
    private int Thursday;
//    @NotEmpty(message = "Friday is empty")
//    @Size(min = 0, max = 8, message = "Friday hours should from 0 to 8")
    private int Friday;
//    @NotEmpty(message = "Saturday is empty")
//    @Size(min = 0, max = 8, message = "Saturday hours should from 0 to 8")
    private int Saturday;
//    @NotEmpty(message = "Sunday is empty")
//    @Size(min = 0, max = 8, message = "Sunday hours should from 0 to 8")
    private int Sunday;

    public WeekTime() {

    }

    public WeekTime(int monday, int tuesday, int wednesday, int thursday, int friday, int saturday, int sunday) {
        Monday = monday;
        Tuesday = tuesday;
        Wednesday = wednesday;
        Thursday = thursday;
        Friday = friday;
        Saturday = saturday;
        Sunday = sunday;
    }

    public int getMonday() {
        return Monday;
    }

    public void setMonday(int monday) {
        Monday = monday;
    }

    public int getTuesday() {
        return Tuesday;
    }

    public void setTuesday(int tuesday) {
        Tuesday = tuesday;
    }

    public int getWednesday() {
        return Wednesday;
    }

    public void setWednesday(int wednesday) {
        Wednesday = wednesday;
    }

    public int getThursday() {
        return Thursday;
    }

    public void setThursday(int thursday) {
        Thursday = thursday;
    }

    public int getFriday() {
        return Friday;
    }

    public void setFriday(int friday) {
        Friday = friday;
    }

    public int getSaturday() {
        return Saturday;
    }

    public void setSaturday(int saturday) {
        Saturday = saturday;
    }

    public int getSunday() {
        return Sunday;
    }

    public void setSunday(int sunday) {
        Sunday = sunday;
    }

    /**
     *
     * @param dayHours
     * @return 当天的所输入的时间是否是有效的
     */
    public boolean checkHours(int dayHours){
        if (dayHours >= 0 && dayHours <= 8){
            return true;
        }
        else {
            return false;
        }
    }

    public ArrayList<String> invalidationDay() {
        ArrayList<String> res = new ArrayList<>();
        if (!this.checkHours(this.Monday)){
            res.add("Monday hours should between 0 to 8");
        }
        if (!this.checkHours(this.Tuesday)){
            res.add("Tuesday hours should between 0 to 8");
        }
        if (!this.checkHours(this.Wednesday)){
            res.add("Wednesday hours should between 0 to 8");
        }
        if (!this.checkHours(this.Thursday)){
            res.add("Thursday hours should between 0 to 8");
        }
        if (!this.checkHours(this.Friday)){
            res.add("Friday hours should between 0 to 8");
        }
        if (!this.checkHours(this.Saturday)){
            res.add("Saturday hours should between 0 to 8");
        }
        if (!this.checkHours(this.Sunday)){
            res.add("Sunday hours should between 0 to 8");
        }
        return res;
    }

    public boolean getCheckDayResult(){
        if (this.invalidationDay().size()>0){
            return false;
        }
        else {
            return true;
        }
    }
}
