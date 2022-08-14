//package com.revature.spring.backend.model;
//
//import java.time.LocalDateTime;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import org.hibernate.annotations.CreationTimestamp;
//
//@Entity
//public class Order {
//	
//	@Id
//	@GeneratedValue
//	private Integer order_id;
//	private int subtotal;
//	private int tax;
//	private int total;
//	@CreationTimestamp
//	@Column(updatable=false)
//	private LocalDateTime timestamp;
//
//	public Order(Integer order_id, int subtotal, int tax, int total, LocalDateTime timestamp) {
//		super();
//		this.order_id = order_id;
//		this.subtotal = subtotal;
//		this.tax = tax;
//		this.total = total;
//		this.timestamp = timestamp;
//	}
//	public Order() {
//		super();
//	}
//
//	public Integer getOrder_id() {
//		return order_id;
//	}
//
//	public void setOrder_id(Integer order_id) {
//		this.order_id = order_id;
//	}
//
//	public int getSubtotal() {
//		return subtotal;
//	}
//
//	public void setSubtotal(int subtotal) {
//		this.subtotal = subtotal;
//	}
//
//	public int getTax() {
//		return tax;
//	}
//
//	public void setTax(int tax) {
//		this.tax = tax;
//	}
//
//	public int getTotal() {
//		return total;
//	}
//
//	public void setTotal(int total) {
//		this.total = total;
//	}
//
//	public LocalDateTime getTimestamp() {
//		return timestamp;
//	}
//
//	public void setTimestamp(LocalDateTime timestamp) {
//		this.timestamp = timestamp;
//	}
//
//	@Override
//	public String toString() {
//		return "Order [order_id=" + order_id + ", subtotal=" + subtotal + ", tax=" + tax + ", total=" + total
//				+ ", timestamp=" + timestamp + "]";
//	}
//	
//	
//
//}
