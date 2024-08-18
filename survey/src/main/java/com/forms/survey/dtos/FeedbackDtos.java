package com.forms.survey.dtos;

import org.springframework.stereotype.Component;

@Component
public class FeedbackDtos {
    private String name;
    private String email;
    private int age;
    private String gender;
    //private String serviceFeedback;
    private String comments;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

//    public String getServiceFeedback() {
//        return serviceFeedback;
//    }
//
//    public void setServiceFeedback(String serviceFeedback) {
//        this.serviceFeedback = serviceFeedback;
//    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "FeedbackDtos{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
              //  ", serviceFeedback='" + serviceFeedback + '\'' +
                ", comments='" + comments + '\'' +
                '}';
    }
}
