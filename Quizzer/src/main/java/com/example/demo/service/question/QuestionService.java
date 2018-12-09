package com.example.demo.service.question;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.demo.model.question.Question;
import com.example.demo.model.question.QuestionSet;
import com.example.demo.model.question.QuestionType;
import com.example.demo.repository.question.QuestionRepository;
import com.example.demo.repository.question.QuestionSetRepository;
import com.example.demo.repository.question.QuestionTypeRepository;

@Service
@Transactional
public class QuestionService {

	private QuestionRepository questionRepository;
	private QuestionTypeRepository questionTypeRepository;
	private QuestionSetRepository questionSetRepository;

	public QuestionService(QuestionRepository questionRepository, QuestionTypeRepository questionTypeRepository,QuestionSetRepository questionSetRepository) {
		this.questionRepository = questionRepository;
		this.questionTypeRepository = questionTypeRepository;
		this.questionSetRepository = questionSetRepository;

	}

	public void saveQuestionType(QuestionType questionType) {
		questionTypeRepository.save(questionType);

	}

	public void saveQuestion(Question question) {
		questionRepository.save(question);

	}

	public void updateQuestionById(Question question) {
		questionRepository.save(question);		
	}

	public void deleteQuestion(Long QuestionId) {
		questionRepository.deleteById(QuestionId);
	}
	
	public Question findByQuestionId(Long questionId){
		return questionRepository.findByQuestionId(questionId);
		
	}
	
	public void saveQuestionSet(QuestionSet questionSet) {
		questionSetRepository.save(questionSet);

	}
	
	public void updateQuestionSetById(QuestionSet questionSet) {
		questionSetRepository.save(questionSet);		
	}
	
	public void deleteQuestionSet(Long QuestionSetId) {
		questionSetRepository.deleteById(QuestionSetId);
	}
	
	public QuestionSet findByQuestionSetId(Long questionSetId){
		return questionSetRepository.findByQuestionSetId(questionSetId);
		
	}


}
