package com.TW.timeCard.services;

import com.TW.timeCard.models.TimeCardInfo;
//import com.TW.timeCard.repositories.TimeCardRepository;
//import org.springframework.beans.factory.annotation.Autowired;

public class TimeCardService {
//    @Autowired
//    private TimeCardRepository timeCardRepository;

    public int whetherValidation(TimeCardInfo timeCardInfo) {
        if(timeCardInfo.checkResult()){
            return 201;
        }
        else return 400;
    }

    public String getPostResult(TimeCardInfo timeCardInfo) {
        if (timeCardInfo.getTimeCardInfoErrorMessage().size()==0){
//            timeCardRepository.save(timeCardInfo);
            return "Created";
        }
        else {
            String errorMessages = "";
            for (String errorMessage:timeCardInfo.getTimeCardInfoErrorMessage()){
                errorMessages += errorMessage+"\n";
            }
            return "Error: "+errorMessages;
        }
    }
}
