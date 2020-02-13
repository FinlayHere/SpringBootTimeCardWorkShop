package com.TW.timeCard.models;

public class WeekTime {
    private int Monday;
    private int Tuesday;
    private int Wednesday;
    private int Thursday;
    private int Friday;
    private int Saturday;
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
}
