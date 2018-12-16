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

import com.example.demo.model.question.Question;
import com.example.demo.service.question.QuestionService;

@RestController
public class QuestionRestController {
	@Autowired
	QuestionService questionService;

	@RequestMapping(value = "/createQuestion", headers = {
    "content-type=application/json" }, method = RequestMethod.POST)
	public Object createQuestion(@RequestBody Question question) {
		questionService.saveQuestion(question);
		return question; 
	}
	
	@PutMapping("/editQuestion")
	public String editQuestion(@RequestBody Question question) {
		questionService.updateQuestionById(question);
		return null;}
	
	@DeleteMapping("/deleteQuestion/{id}")
	public String deleteQuestion(@PathVariable("id") Long questionId) {
		questionService.deleteQuestion(questionId);
		return "Question deleted";
		
	}
	
	@GetMapping("/getQuestion/{id}")
	public Object getQuestion(@PathVariable("id") Long questionId) {
		Question question= questionService.findByQuestionId(questionId);
		if (question== null) {
			return "Question not found....";
		}
		return question;
		 
	}
	
	public String getAllQuestions(@PathVariable("id") Long questionSetsId) {
		return null;
		
		
	}
}
