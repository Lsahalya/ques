package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.QuestionsData;
import com.example.demo.exception.questionException;
import com.example.demo.repository.Questionsrepository;

@Service
public class Questionserviceimpl implements questionService{
	
	@Autowired
	private Questionsrepository questionsrepository;

	@Override
	public QuestionsData addQuestion(QuestionsData question) {
		return questionsrepository.save(question);
	}

	@Override
	public List<QuestionsData> getAllQuestions() throws questionException {
		List<QuestionsData>allQuestions=(List<QuestionsData>) questionsrepository.findAll();
        if(questionException.checkIfListEmpty(allQuestions)) {
            throw new questionException("No payments are found in the records");
        }
        return allQuestions ;
	}

	@Override
	public QuestionsData getQuestionById(int id) throws questionException{
		 Optional<QuestionsData> question=questionsrepository.findById(id);
	        if(question.isPresent())
	            return question.get();
	            else
	                throw new questionException("No details found with the given id");
	        }
		
	@Override
	public void deleteQuestion(int id)throws questionException{
		 Optional<QuestionsData> payment=questionsrepository.findById(id);
	        if(payment.isPresent())
	        {
	            questionsrepository.deleteById(id);
	        }
	        else
	        {
	            throw new questionException("No details found for the given id");
	        }
	    }
		
	}

	

