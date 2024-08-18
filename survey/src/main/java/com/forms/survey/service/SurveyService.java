package com.forms.survey.service;

import com.forms.survey.dtos.FeedbackDtos;
import com.forms.survey.entity.FeedBack;
import com.forms.survey.mapper.FeedbackMapper;
import com.forms.survey.repository.SurveyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SurveyService {
    @Autowired
    SurveyRepo surveyRepo;
    @Autowired
    FeedbackMapper feedbackMapper;
    public boolean storeFeedback(FeedbackDtos feedbackDtos) {
        FeedBack feedBack = feedbackMapper.convertToEntity(feedbackDtos);
        if(surveyRepo.save(feedBack)!=null){
            return true;
        }
        return false;
    }
}
