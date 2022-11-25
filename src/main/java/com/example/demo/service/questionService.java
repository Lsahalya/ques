package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.QuestionsData;
import com.example.demo.exception.questionException;

public interface questionService {


	public QuestionsData addQuestion(QuestionsData question);

	public List<QuestionsData> getAllQuestions() throws questionException;

	public QuestionsData getQuestionById(int id) throws questionException;

	public void deleteQuestion(int id) throws questionException;

}
