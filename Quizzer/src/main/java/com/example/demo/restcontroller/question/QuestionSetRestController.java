package com.example.demo.restcontroller.question;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.question.QuestionSet;
import com.example.demo.service.question.QuestionService;

@RestController
public class QuestionSetRestController {
	@Autowired
	QuestionService questionService;
	
	@RequestMapping(value = "/createQuestionSet", headers = {
    "content-type=application/json" }, method = RequestMethod.POST)
	public Object createQuestion(@RequestBody QuestionSet questionSet) {
		questionService.saveQuestionSet(questionSet);
		return questionSet;
	}
	
	@PutMapping("/editQuestionSet")
	public String editQuestion(@RequestBody QuestionSet questionSet) {
		questionService.updateQuestionSetById(questionSet);
		return null;}
	
	@DeleteMapping("/deleteQuestionSet/{id}")
	public String deleteQuestion(@PathVariable("id") Long questionSetId) {
		questionService.deleteQuestionSet(questionSetId);
		return "Question deleted";
		
	}
	
	@GetMapping("/getQuestionSet/{id}")
	public Object getQuestion(@PathVariable("id") Long questionSetId) {
		QuestionSet questionSet= questionService.findByQuestionSetId(questionSetId);
		if (questionSet== null) {
			return "QuestionSet not found....";
		}
		return questionSet;
		 
	}

}
