package com.TW.timeCard.controllers;

import com.TW.timeCard.models.TimeCardInfo;
import com.TW.timeCard.services.TimeCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api")
public class TimeCardController {
    @Autowired
    private TimeCardService timeCardService;

    @PostMapping(path = "/timeCards")
    @ResponseBody
    public ResponseEntity<String> postTimeCard(@RequestBody TimeCardInfo timeCardInfo) {
        return ResponseEntity.status(timeCardService.whetherValidation(timeCardInfo))
                .body(timeCardService.getPostResult(timeCardInfo));
    }
}
