package com.example.spring.graphql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.spring.graphql.model.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}