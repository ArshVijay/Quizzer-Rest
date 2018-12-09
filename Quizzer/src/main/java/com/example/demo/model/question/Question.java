package com.example.demo.model.question;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="QUESTION")
public class Question {
	private Long questionId;
	private Long questionSetId;
	private String questionName;
	private String questionTypeCode;
	private String optionA;
	private String optionB;
	private String optionC;
	private String optionD;
	private String optionE;
	private String optionF;
	private String optionG;
	private String optionH;
	private String optionI;
	private Boolean answerA;
	private Boolean answerB;
	private Boolean answerC;
	private Boolean answerD;
	private Boolean answerE;
	private Boolean answerF;
	private Boolean answerG;
	private Boolean answerH;
	private Boolean answerI;
	private Boolean nagativeFlag;
	private Integer marks;
	private Integer negativeMarks;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="QUESTION_ID")
	public Long getQuestionId() {
		return questionId;
	}
	public void setQuestionId(Long questionId) {
		this.questionId = questionId;
	}
	@Column(name="QUESTION_SET_ID")
	public Long getQuestionSetId() {
		return questionSetId;
	}
	public void setQuestionSetId(Long questionSetId) {
		this.questionSetId = questionSetId;
	}
	@Column(name="QUESTION_NAME")
	public String getQuestionName() {
		return questionName;
	}
	public void setQuestionName(String questionName) {
		this.questionName = questionName;
	}
	@Column(name="QUESTION_TYPE_CODE")
	public String getQuestionTypeCode() {
		return questionTypeCode;
	}
	public void setQuestionTypeCode(String questionTypeCode) {
		this.questionTypeCode = questionTypeCode;
	}
	@Column(name="OPTION_A")
	public String getOptionA() {
		return optionA;
	}
	public void setOptionA(String optionA) {
		this.optionA = optionA;
	}
	@Column(name="OPTION_B")
	public String getOptionB() {
		return optionB;
	}
	public void setOptionB(String optionB) {
		this.optionB = optionB;
	}
	@Column(name="OPTION_C")
	public String getOptionC() {
		return optionC;
	}
	public void setOptionC(String optionC) {
		this.optionC = optionC;
	}
	@Column(name="OPTION_D")
	public String getOptionD() {
		return optionD;
	}
	public void setOptionD(String optionD) {
		this.optionD = optionD;
	}
	@Column(name="OPTION_E")
	public String getOptionE() {
		return optionE;
	}
	public void setOptionE(String optionE) {
		this.optionE = optionE;
	}
	@Column(name="OPTION_F")
	public String getOptionF() {
		return optionF;
	}
	public void setOptionF(String optionF) {
		this.optionF = optionF;
	}
	@Column(name="OPTION_G")
	public String getOptionG() {
		return optionG;
	}
	public void setOptionG(String optionG) {
		this.optionG = optionG;
	}
	@Column(name="OPTION_H")
	public String getOptionH() {
		return optionH;
	}
	public void setOptionH(String optionH) {
		this.optionH = optionH;
	}
	@Column(name="OPTION_I")
	public String getOptionI() {
		return optionI;
	}
	public void setOptionI(String optionI) {
		this.optionI = optionI;
	}
	@Column(name="ANSWER_A")
	public Boolean getAnswerA() {
		return answerA;
	}
	public void setAnswerA(Boolean answerA) {
		this.answerA = answerA;
	}
	@Column(name="ANSWER_B")
	public Boolean getAnswerB() {
		return answerB;
	}
	public void setAnswerB(Boolean answerB) {
		this.answerB = answerB;
	}
	@Column(name="ANSWER_C")
	public Boolean getAnswerC() {
		return answerC;
	}
	public void setAnswerC(Boolean answerC) {
		this.answerC = answerC;
	}
	@Column(name="ANSWER_D")
	public Boolean getAnswerD() {
		return answerD;
	}
	public void setAnswerD(Boolean answerD) {
		this.answerD = answerD;
	}
	@Column(name="ANSWER_E")
	public Boolean getAnswerE() {
		return answerE;
	}
	public void setAnswerE(Boolean answerE) {
		this.answerE = answerE;
	}
	@Column(name="ANSWER_F")
	public Boolean getAnswerF() {
		return answerF;
	}
	public void setAnswerF(Boolean answerF) {
		this.answerF = answerF;
	}
	@Column(name="ANSWER_G")
	public Boolean getAnswerG() {
		return answerG;
	}
	public void setAnswerG(Boolean answerG) {
		this.answerG = answerG;
	}
	@Column(name="ANSWER_H")
	public Boolean getAnswerH() {
		return answerH;
	}
	public void setAnswerH(Boolean answerH) {
		this.answerH = answerH;
	}
	@Column(name="ANSWER_I")
	public Boolean getAnswerI() {
		return answerI;
	}
	public void setAnswerI(Boolean answerI) {
		this.answerI = answerI;
	}
	@Column(name="NEGATIVE_FLAG")
	public Boolean getNagativeFlag() {
		return nagativeFlag;
	}
	public void setNagativeFlag(Boolean nagativeFlag) {
		this.nagativeFlag = nagativeFlag;
	}
	@Column(name="MARKS")
	public Integer getMarks() {
		return marks;
	}
	public void setMarks(Integer marks) {
		this.marks = marks;
	}
	@Column(name="NEGATIVE_MARKS")
	public Integer getNegativeMarks() {
		return negativeMarks;
	}
	public void setNegativeMarks(Integer negativeMarks) {
		this.negativeMarks = negativeMarks;
	}
	
	
	
	public Question(Long questionSetId, String questionName, String questionTypeCode, String optionA, String optionB,
			String optionC, String optionD, String optionE, String optionF, String optionG, String optionH,
			String optionI, Boolean answerA, Boolean answerB, Boolean answerC, Boolean answerD, Boolean answerE,
			Boolean answerF, Boolean answerG, Boolean answerH, Boolean answerI, Boolean nagativeFlag, Integer marks,
			Integer negativeMarks) {
		super();
		this.questionSetId = questionSetId;
		this.questionName = questionName;
		this.questionTypeCode = questionTypeCode;
		this.optionA = optionA;
		this.optionB = optionB;
		this.optionC = optionC;
		this.optionD = optionD;
		this.optionE = optionE;
		this.optionF = optionF;
		this.optionG = optionG;
		this.optionH = optionH;
		this.optionI = optionI;
		this.answerA = answerA;
		this.answerB = answerB;
		this.answerC = answerC;
		this.answerD = answerD;
		this.answerE = answerE;
		this.answerF = answerF;
		this.answerG = answerG;
		this.answerH = answerH;
		this.answerI = answerI;
		this.nagativeFlag = nagativeFlag;
		this.marks = marks;
		this.negativeMarks = negativeMarks;
	}
	@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", questionSetId=" + questionSetId + ", questionName="
				+ questionName + ", questionTypeId=" + questionTypeCode + ", optionA=" + optionA + ", optionB=" + optionB
				+ ", optionC=" + optionC + ", optionD=" + optionD + ", optionE=" + optionE + ", optionF=" + optionF
				+ ", optionG=" + optionG + ", optionH=" + optionH + ", optionI=" + optionI + ", answerA=" + answerA
				+ ", answerB=" + answerB + ", answerC=" + answerC + ", answerD=" + answerD + ", answerE=" + answerE
				+ ", answerF=" + answerF + ", answerG=" + answerG + ", answerH=" + answerH + ", answerI=" + answerI
				+ ", nagativeFlag=" + nagativeFlag + ", marks=" + marks + ", negativeMarks=" + negativeMarks + "]";
	}
    
	public Question() {}
}
