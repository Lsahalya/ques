package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.QuestionsData;

//import com.example.question.QuestionsData;
@Repository
public interface Questionsrepository extends CrudRepository<QuestionsData,Integer> {

}
