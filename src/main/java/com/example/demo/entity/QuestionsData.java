package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;


@Entity

public class QuestionsData {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	
	private String quesname;
	private String choiceOne;
	private String choiceTwo;
	private String choiceThree;
	private String choiceFour;
	
	private String answer;
	
	//@Transient
    private String getGivenAnswer;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQuesname() {
		return quesname;
	}

	public void setQuesname(String quesname) {
		this.quesname = quesname;
	}

	public String getChoiceOne() {
		return choiceOne;
	}

	public void setChoiceOne(String choiceOne) {
		this.choiceOne = choiceOne;
	}

	public String getChoiceTwo() {
		return choiceTwo;
	}

	public void setChoiceTwo(String choiceTwo) {
		this.choiceTwo = choiceTwo;
	}

	public String getChoiceThree() {
		return choiceThree;
	}

	public void setChoiceThree(String choiceThree) {
		this.choiceThree = choiceThree;
	}

	public String getChoiceFour() {
		return choiceFour;
	}

	public void setChoiceFour(String choiceFour) {
		this.choiceFour = choiceFour;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getGetGivenAnswer() {
		return getGivenAnswer;
	}

	public void setGetGivenAnswer(String getGivenAnswer) {
		this.getGivenAnswer = getGivenAnswer;
	}

	
}