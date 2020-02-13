package com.TW.timeCard.models;

import java.util.ArrayList;

public class TimeCardInfo {
    private long userId;
    private ArrayList<TimeCard> timeCards;
    public String notes;

    public TimeCardInfo() {
    }

    public TimeCardInfo(long userId, ArrayList<TimeCard> timeCards, String notes) {
        this.userId = userId;
        this.timeCards = timeCards;
        this.notes = notes;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public ArrayList<TimeCard> getTimeCards() {
        return timeCards;
    }

    public void setTimeCards(ArrayList<TimeCard> timeCards) {
        this.timeCards = timeCards;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}


/**
 * this class is use for TWer.
 * according to Json structure
 * {
 *     "User":$user_id,
 *     "TimeCard":
 *     [
 *       {
 *          "Project":$projectName,
 *          "SubProject":$sub_project,
 *          "Location":$location,
 *          "StartDate":$startDate,
 *          "WeekTime:"
 *          {
 *              "Monday":$hours,
 *              "Tuesday":$hours,
 *              "Wednesday":$hours,
 *              "Thursday":$hours,
 *              "Friday":$hours,
 *              "Saturday":$hours,
 *              "Sunday":$hours,
 *          },
 *          "Billable":$whetherBillable,
 *          "Comments":$comment
 *      },
 *      .
 *      .
 *      .
 *      {
 *
 *      }
 *     ],
 *     "Notes":$notes
 * }
 */