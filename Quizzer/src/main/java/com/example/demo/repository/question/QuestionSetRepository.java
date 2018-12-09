package com.example.demo.repository.question;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.question.Question;
import com.example.demo.model.question.QuestionSet;

public interface QuestionSetRepository extends CrudRepository<QuestionSet, Long>{

	QuestionSet findByQuestionSetId(Long questionSetId);

}
