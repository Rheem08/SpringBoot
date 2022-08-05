package com.revature.spring.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.spring.backend.model.Books;

public interface BooksRepository  extends JpaRepository<Books, Integer>{

}
