package com.TW.timeCard.models;

//import org.hibernate.validator.constraints.Length;
//
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TimeCardInfo {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String userId;
    @OneToMany(mappedBy = "timeCards")
    private ArrayList<TimeCard> timeCards;
//    @Length(max = 100)
    public String notes;

    public TimeCardInfo() {
    }

    public TimeCardInfo(String userId, ArrayList<TimeCard> timeCards, String notes) {
        this.userId = userId;
        this.timeCards = timeCards;
        this.notes = notes;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
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

    public boolean checkId(){
        Pattern pattern = Pattern.compile("\\d{5}");
        Matcher matcher = pattern.matcher(this.userId);
        return matcher.matches();
    }

    public boolean checkNotes(){
        return this.notes.length() >100;
    }

    public boolean checkTimeCards(){
        for (TimeCard timeCard: this.timeCards){
            if (!timeCard.checkResult())
                return false;
        }
        return true;
    }

    public ArrayList<String> getAllTimeCardCheckResult(){
        ArrayList res = new ArrayList<>();
        for (TimeCard timeCard: this.timeCards){
            if (timeCard.checkTimeCard().size()>0){
                for (String errorMessage:timeCard.checkTimeCard()) {
                    res.add(errorMessage);
                }
            }
        }
        return res;
    }

    public ArrayList<String> getTimeCardInfoErrorMessage(){
        ArrayList res = new ArrayList<>();
        if (!checkId()){
            res.add("user id should be 5 numbers");
        }
        if (checkNotes()){
            res.add("Notes should not longer than 100");
        }
        if (!this.checkTimeCards()){
            for (String errorMessage:this.getAllTimeCardCheckResult()){
                res.add(errorMessage);
            }
        }
        return res;
    }

    public boolean checkResult(){
        return this.getTimeCardInfoErrorMessage().size()==0;
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