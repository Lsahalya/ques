package com.example.demo.exception;

import java.util.List;

import com.example.demo.entity.QuestionsData;

public class questionException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public questionException(String message)
	{
		super(message);
	}
	public static boolean checkIfListEmpty(List<QuestionsData> allQuestions) {
		if(allQuestions.isEmpty()) {
			return true;
		}

		return false;
	}
	

}
