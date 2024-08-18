package com.forms.survey.repository;

import com.forms.survey.entity.FeedBack;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SurveyRepo extends JpaRepository<FeedBack,Long> {
}
