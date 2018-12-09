package com.example.demo.repository.question;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.question.Question;

public interface QuestionRepository extends CrudRepository<Question, Long>{

	Question findByQuestionId(Long questionId);



}
