package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;

import com.example.demo.model.question.Question;
import com.example.demo.model.question.QuestionSet;
import com.example.demo.model.question.QuestionType;
import com.example.demo.model.user.Role;
import com.example.demo.model.user.User;
import com.example.demo.model.user.UserRole;
import com.example.demo.service.question.QuestionService;
import com.example.demo.service.user.UserService;

@SpringBootApplication
public class QuizzerApplication {

	@Autowired
	private QuestionService questionService;
	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(QuizzerApplication.class, args);
	}

	@EventListener
	public void seed(ContextRefreshedEvent event) {
		System.out.println("**** Seeding Data : Started ****");
		seedQuestionTypes();
		seedQuestionSets();
		seedQuestions();
		seedUsers();
		seedRoles();
		seedUserRoles();
		System.out.println("**** Seeding Data : Finished****");
	}

	public void seedQuestionTypes() {	
		questionService.saveQuestionType(new QuestionType("MULTI_CHOICE", "MultipleChoice"));
		questionService.saveQuestionType(new QuestionType("SINGLE_CHOICE", "Single choice"));
		questionService.saveQuestionType(new QuestionType("TRUE_FALSE", "true or false"));
		questionService.saveQuestionType(new QuestionType("FILL_BLANKS", "Fill in the blanks"));
	}
	
	public void seedQuestionSets() {	
		questionService.saveQuestionSet(new QuestionSet("GK", 0));
		questionService.saveQuestionSet(new QuestionSet("Java", 0));
		questionService.saveQuestionSet(new QuestionSet("Php", 0));
		questionService.saveQuestionSet(new QuestionSet("JavaScript", 0));
		questionService.saveQuestionSet(new QuestionSet("Ruby", 0));
	}

	public void seedQuestions() {
		questionService.saveQuestion(new Question(5l,"Capital city of telangana?", "SINGLE_CHOICE", "Amaravathi","Hyderabad", "Secundrabad", "Patna", null, null, null, null, null, false, true, false, false, false,false, false, false, false, false, 10, 0));
		questionService.saveQuestion(new Question(5l,"The Greek Ambassador Deimachus of Plataea had visited the court of which of the following rulers of Magadha?","SINGLE_CHOICE", "Dhanananda", "Chandragupta Maurya", "Bindusara", "Asoka", null, null, null, null,	null, false, false, true, false, false, false, false, false, false, false, 10, 0));
		questionService.saveQuestion(new Question(5l, "Who among the following is writer of the ‘Kalpasutra’?","SINGLE_CHOICE", "Simuka", "Panini", "Bhadrabahu", "Patanjali", null, null, null, null, null, false,false, true, false, false, false, false, false, false, false, 10, 0));
		questionService.saveQuestion(new Question(5l, "Grand Central Terminal, Park Avenue, New York is the world's","SINGLE_CHOICE", "largest railway station", "highest railway station", "longest railway station","None of the above", null, null, null, null, null, true, false, false, false, false, false, false,false, false, false, 10, 0));
		questionService.saveQuestion(new Question(5l, "Hitler party which came into power in 1933 is known as","SINGLE_CHOICE", "Labour Party", "Nazi Party", "Ku-Klux-Klan", "Democratic Party", null, null, null,null, null, false, true, false, false, false, false, false, false, false, false, 10, 0));
	}

	public void seedUsers() {
		userService.saveUser(new User("ArshVijay", "Vijay Kumar", "Gandham", "gandhamvijaykumar@gmail.com", "Welcome1"));
		userService.saveUser(new User("PreetiBhai", "Preeti", "kumari", "preetibhai@gmail.com", "Welcome1"));
		userService.saveUser(new User("SamInRed", "Tirupathi", "Reddy", "TirupathiReddy@gmail.com", "Welcome1"));
		userService.saveUser(new User("AkSharma", "Ankit Kumar", "Shrma", "ankitkumarSharma@gmail.com", "Welcome1"));
		userService.saveUser(new User("RamKaka", "Ram", "Kaka", "ramukaka@gmail.com", "Welcome1"));
		userService.saveUser(new User("Shashikan", "Shashi", "tiru", "shashithumma@gmail.com", "Welcome1"));
		
	}
	public void seedRoles() {
		
		userService.saveRole(new Role(1001l, "Admin"));
		userService.saveRole(new Role(1002l, "User"));
		userService.saveRole(new Role(1003l, "Teacher"));
	}
	public void seedUserRoles() {
		userService.saveUserRole(new UserRole(15l, 21l));
		userService.saveUserRole(new UserRole(16l, 21l));
		userService.saveUserRole(new UserRole(17l, 22l));
		userService.saveUserRole(new UserRole(18l, 23l));
		userService.saveUserRole(new UserRole(19l, 23l));
		userService.saveUserRole(new UserRole(20l, 24l));
	}
	
}
