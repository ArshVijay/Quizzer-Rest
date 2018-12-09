package com.example.demo.model.question;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="QUESTION_SET")
public class QuestionSet {
	private Long questionSetId;
	private String questionSetName;
	private Integer totalMarks;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="QUESTION_SET_ID")
	public Long getQuestionSetId() {
		return questionSetId;
	}
	public void setQuestionSetId(Long questionSetId) {
		this.questionSetId = questionSetId;
	}
	@Column(name="QUESTION_SET_NAME")
	public String getQuestionSetName() {
		return questionSetName;
	}
	public void setQuestionSetName(String questionSetName) {
		this.questionSetName = questionSetName;
	}
	@Column(name="TOTAL_MARKS")
	public Integer getTotalMarks() {
		return totalMarks;
	}
	public void setTotalMarks(Integer totalMarks) {
		this.totalMarks = totalMarks;
	}
	public QuestionSet(String questionSetName, Integer totalMarks) {
		super();
		this.questionSetName = questionSetName;
		this.totalMarks = totalMarks;
	}
	@Override
	public String toString() {
		return "QuestionSet [questionSetId=" + questionSetId + ", questionSetName=" + questionSetName + ", totalMarks="
				+ totalMarks + "]";
	}

	public QuestionSet() {}
}
