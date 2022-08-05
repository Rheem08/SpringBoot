package com.revature.spring.backend.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
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
	@DeleteMapping("/booky/{id}")
	public String deleteById(@PathVariable Integer id) {
		bRepo.deleteById(id);
		return "product removed || "+id;
	}
	@PutMapping("/booky/update/{id}")
	public Booky updateBooky(@PathVariable Integer id,@RequestBody Booky b){
		Booky existingB= bRepo.findById(id).orElse(null);
		existingB.setUsername(b.getUsername());
		existingB.setP_word(b.getP_word());
		existingB.setF_name(b.getF_name());
		existingB.setL_name(b.getL_name());
		existingB.setEmail(b.getEmail());
		return bRepo.save(existingB);
	}
//	@GetMapping("/booky/log/{username}/{p_word}")
//	public Booky logging(@PathVariable String username, @PathVariable String p_word) {
//		List<Booky> bookies = new ArrayList<>();
//		bookies.addAll(bRepo.findAll());
//		Booky b=bRepo.findByUsernameAndP_word(username, p_word);
//		return b;
//	}
	
//	@GetMapping("/bookies/{username}")
//	public Booky getByUsername(@PathVariable String username) {
//		return bRepo.findByUsernameAndP_word(username);
//	}
		

	
	
	
	
	
	
	
}
