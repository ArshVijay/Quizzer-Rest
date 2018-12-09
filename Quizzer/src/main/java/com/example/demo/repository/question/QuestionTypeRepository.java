package com.example.demo.repository.question;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.question.Question;
import com.example.demo.model.question.QuestionType;

public interface QuestionTypeRepository extends CrudRepository<QuestionType, Long>{

}
