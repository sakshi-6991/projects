package com.forms.survey.controller;

import com.forms.survey.dtos.FeedbackDtos;
import com.forms.survey.entity.FeedBack;
import com.forms.survey.service.SurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SurveyController {
    @Autowired
    SurveyService surveyService;
    @GetMapping("/")
    public ModelAndView getForm(){
        return new ModelAndView("form");
    }
    @PostMapping("/")
    public ModelAndView storeFeedback(FeedbackDtos feedbackDtos){
        if(surveyService.storeFeedback(feedbackDtos)){
            return new ModelAndView("form");
        }
        return new ModelAndView("exceptionpage");
    }
}
