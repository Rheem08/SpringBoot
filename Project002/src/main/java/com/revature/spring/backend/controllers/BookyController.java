package com.revature.spring.backend.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.spring.backend.model.Booky;
import com.revature.spring.backend.repository.BookyRepository;

@RestController
@CrossOrigin
public class BookyController {
	
	@Autowired
	private BookyRepository bRepo; //injection of repository object to use its methods
	
	@PostMapping("/booky") //where to send form when creating new object
	public void addBooky(@RequestBody Booky b) { //use of postman
		bRepo.save(b); //save object of booky into database/repository
	}
	
	@GetMapping("/booky") //all bookreaders
	public List<Booky> getAllBookies(){
		return bRepo.findAll();
	}
	
	@GetMapping("/booky/{id}") //bookreaders by id
	public Optional<Booky> getBookyById(@PathVariable Integer id){
		return bRepo.findById(id);
	}
	
	@GetMapping("/bookies/{username}")
	public Booky getByUsername(@PathVariable String username) {
		return bRepo.findByUsernameAndP_word(username);
	}
		

}