package com.forms.survey.mapper;

import com.forms.survey.dtos.FeedbackDtos;
import com.forms.survey.entity.FeedBack;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FeedbackMapper {
    public FeedBack convertToEntity(FeedbackDtos feedbackDtos){
        FeedBack feedback = new FeedBack();
        feedback.setName(feedbackDtos.getName());
        feedback.setAge(feedbackDtos.getAge());
        feedback.setEmail(feedbackDtos.getEmail());
        feedback.setGender(feedbackDtos.getGender());
        //feedback.setServiceFeedback(feedbackDtos.getServiceFeedback());
        feedback.setComments(feedbackDtos.getComments());
        return feedback;
    }
}
