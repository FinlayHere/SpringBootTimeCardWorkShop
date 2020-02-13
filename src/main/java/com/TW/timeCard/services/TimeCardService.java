package com.TW.timeCard.services;

import com.TW.timeCard.models.TimeCardInfo;

public class TimeCardService {

    public int whetherValidation(TimeCardInfo timeCardInfo) {
        if(timeCardInfo.checkResult()){
            return 201;
        }
        else return 400;
    }

    public String getPostResult(TimeCardInfo timeCardInfo) {
        if (timeCardInfo.getTimeCardInfoErrorMessage().size()==0){
            return "Created";
        }
        else {
            String errorMessages = "";
            for (String errorMessage:timeCardInfo.getTimeCardInfoErrorMessage()){
                errorMessage += errorMessages+"\n";
            }
            return "Error: "+errorMessages;
        }
    }
}
