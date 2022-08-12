package com.revature.spring.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
		
		//test save
		itemRepo.save(b);
		
	}
	//since its a book, only updates i can think of that would need to persist
	// would be the cost of the item and how much is in stock
	@PutMapping("/inventory/update/{id}")
	public Books updateBooks(@PathVariable Integer id,@RequestBody Books b){
		//below i am querying to find specific user based on their id
		Books existingB= itemRepo.findById(id).orElse(null);
		//save this value and SET new values to persist update
		//lastly save !
		existingB.setCost(b.getCost());
		existingB.setStock(b.getStock());
		
		return itemRepo.save(existingB);
	} 
	
	@DeleteMapping("/books/{id}")
	public String deleteById(@PathVariable Integer id) {
		itemRepo.deleteById(id);
		return "product removed || "+id;
	}

}
