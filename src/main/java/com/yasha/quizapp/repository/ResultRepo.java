package com.yasha.quizapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yasha.quizapp.model.Result;

@Repository
public interface ResultRepo extends JpaRepository<Result, Integer> {
	
}
