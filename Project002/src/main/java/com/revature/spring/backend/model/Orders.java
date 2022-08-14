package com.revature.spring.backend.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import javax.persistence.Id;


@Entity
public class Orders {
	
	@Id
	@GeneratedValue
	private Integer order_id;
	private int subtotal;
	
	private double tax=2.5;
	private int total;

	public Orders(Integer order_id, int subtotal, int tax, int total) {
		super();
		this.order_id = order_id;
		this.subtotal = subtotal;
		this.tax = tax;
		this.total = total;
	
	}
	public Orders() {
		super();
	}

	public Integer getOrder_id() {
		return order_id;
	}

	public void setOrder_id(Integer order_id) {
		this.order_id = order_id;
	}

	public int getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(int subtotal) {
		this.subtotal = subtotal;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	

	@Override
	public String toString() {
		return "Order [order_id=" + order_id + ", subtotal=" + subtotal + ", tax=" + tax + ", total=" + total
				+ "]";
	}
	

}
