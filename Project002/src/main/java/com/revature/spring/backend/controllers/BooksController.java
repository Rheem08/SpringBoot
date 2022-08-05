package com.revature.spring.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.spring.backend.model.Books;
import com.revature.spring.backend.repository.BooksRepository;

@RestController
@CrossOrigin
public class BooksController {
	
	@Autowired
	private BooksRepository itemRepo;
	
	@GetMapping("/inventory")
	public List<Books> showBooks(){
		return itemRepo.findAll();
		
	}
	
	@PostMapping("/inventory")
	public void addBook(@RequestBody Books b) {
		itemRepo.save(b);
		
	}

}
