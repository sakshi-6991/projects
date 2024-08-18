package com.forms.survey.entity;

import org.hibernate.annotations.GeneratorType;
import org.jetbrains.annotations.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "feedback")
public class FeedBack {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @NotNull
    @Column(name = "name")
    private String name;
    @NotNull
    @Column(name="email")
    private String email;
    @NotNull
    @Column(name = "age")
    private int age;
    @NotNull
    @Column(name = "gender")
    private String gender;
    @NotNull
    @Column(name = "service_feedback")
    private String serviceFeedback;
    @NotNull
    @Column(name = "comments")
    private String comments;

    public FeedBack(Long id, String name, String email, int age, String gender, String serviceFeedback, String comments) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
        this.gender = gender;
        this.serviceFeedback = serviceFeedback;
        this.comments = comments;
    }
    public FeedBack(){}

    public void setId(Long id) {
        this.id = id;
    }

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

    public String getServiceFeedback() {
        return serviceFeedback;
    }

    public void setServiceFeedback(String serviceFeedback) {
        this.serviceFeedback = serviceFeedback;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "FeedBack{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", serviceFeedback='" + serviceFeedback + '\'' +
                ", comments='" + comments + '\'' +
                '}';
    }
}
