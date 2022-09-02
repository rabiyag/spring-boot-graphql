package com.example.spring.graphql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.spring.graphql.model.Tutorial;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {

}
