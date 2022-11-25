package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.QuestionsData;
import com.example.demo.exception.questionException;
import com.example.demo.repository.Questionsrepository;
import com.example.demo.service.questionService;

//import com.sample.question.Quesrepository;
//import com.sample.question.questionsData;

@RestController
@CrossOrigin("*")
@RequestMapping("/question")
public class questionsController {
	
	@Autowired
	private questionService QuestionService;
	
	//to show all the question present in database
	
	@PostMapping("/question")
	public ResponseEntity<String> addQuestion(@RequestBody QuestionsData question)
	{
		QuestionService.addQuestion(question);
		return new ResponseEntity<String>("Details added Successfully",HttpStatus.OK);
	}
	@GetMapping("/allQuestions")
	public ResponseEntity<List<QuestionsData>> getAllQuestions()throws questionException{
        List<QuestionsData> allQuestions =QuestionService.getAllQuestions();
        return new ResponseEntity<List<QuestionsData>>(allQuestions,HttpStatus.OK);
    }
    //edit a question in a exam
	@GetMapping("/question/{id}")
	public ResponseEntity<QuestionsData> getQuestionById(@PathVariable ("id") int id)throws questionException{
        QuestionsData retrievedQuestion =QuestionService.getQuestionById(id);
        return new ResponseEntity<QuestionsData>(retrievedQuestion,HttpStatus.OK);
    }
	//delete a question in exam
	@DeleteMapping("/question/{id}")
	public ResponseEntity<String> deleteQuestion(@PathVariable ("id") int id)throws questionException{
    QuestionService.deleteQuestion(id);
    return new ResponseEntity<String>("Payment deleted successfully",HttpStatus.OK) ;
		    }    
	}
    

