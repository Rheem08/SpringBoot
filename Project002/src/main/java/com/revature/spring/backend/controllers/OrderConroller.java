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

import com.revature.spring.backend.model.Orders;
//import com.revature.spring.backend.model.Order;
import com.revature.spring.backend.repository.OrderRepository;

@RestController
@CrossOrigin
public class OrderConroller {
	@Autowired
	private OrderRepository or;
	
	@GetMapping("/order")
//	public List<Order> getAllOrders(){
	public List<Orders> getAllOrders(){
		//List<Order> list = or.findAll();
		return or.findAll();
		}
	
//	@GetMapping("/{id}")
//	public ResponseEntity<Optional<Order>> getOrderById(@PathVariable int id){
//		Optional<Order> order = or.findById(id);
//		return new ResponseEntity<>(order,HttpStatus.OK);
//	}
//	
	@PostMapping("/order")
	//public void postOrder(@RequestBody Order order)
	public void postOrder(@RequestBody Orders order){
		or.save(order);
		
	}
	
}
