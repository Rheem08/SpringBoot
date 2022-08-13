package com.revature.spring.backend.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.spring.backend.model.Order;
import com.revature.spring.backend.repository.OrderRepository;

@RestController("/order")
@CrossOrigin(origins="http://localhost:4200/")
public class OrderConroller {
	
	private OrderRepository or;

	@Autowired
	public OrderConroller(OrderRepository or) {
		super();
		this.or = or;
	}
	
	@GetMapping
	public ResponseEntity<List<Order>> getAllOrders(){
		List<Order> list = or.findAll();
		return new ResponseEntity<>(list,HttpStatus.OK);
		}
	
	@GetMapping("/{id}")
	public ResponseEntity<Optional<Order>> getOrderById(@PathVariable int id){
		Optional<Order> order = or.findById(id);
		return new ResponseEntity<>(order,HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public ResponseEntity<Order> postOrder(@RequestBody Order order){
		Order o = or.save(order);
		return new ResponseEntity<>(o,HttpStatus.CREATED);
		
	}
	
}
