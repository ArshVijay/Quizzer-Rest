package com.example.demo.model.question;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="QUESTION_TYPES")
public class QuestionType {
	private Long questionTypeId;
	private String questionTypeCode;
	private String questionTypeName;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="QUESTION_TYPE_ID")
	public Long getQuestionTypeId() {
		return questionTypeId;
	}
	public void setQuestionTypeId(Long questionTypeId) {
		this.questionTypeId = questionTypeId;
	}
	@Column(name="QUESTION_TYPE_NAME")
	public String getQuestionTypeName() {
		return questionTypeName;
	}
	public void setQuestionTypeName(String questionTypeName) {
		this.questionTypeName = questionTypeName;
	}
	@Column(name="QUESTION_TYPE_CODE")
	public String getQuestionTypeCode() {
		return questionTypeCode;
	}
	public void setQuestionTypeCode(String questionTypeCode) {
		this.questionTypeCode = questionTypeCode;
	}
	public QuestionType( String questionTypeCode, String questionTypeName) {
		super();
		this.questionTypeCode = questionTypeCode;
		this.questionTypeName = questionTypeName;
	}
	
}
