package com.revature.spring.backend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Books {
	
	@Id
	@GeneratedValue
	private Integer itemId;
	private String title;
	private String author;
	private String category;
	private Double cost;
	private Integer stock;
	public Books(Integer itemId, String title, String author, String category, Double cost, Integer stock) {
		super();
		this.itemId = itemId;
		this.title = title;
		this.author = author;
		this.category = category;
		this.cost = cost;
		this.stock = stock;
	}
	public Books() {
		super();
	}
	public Integer getItemId() {
		return itemId;
	}
	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Double getCost() {
		return cost;
	}
	public void setCost(Double cost) {
		this.cost = cost;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	@Override
	public String toString() {
		return "Books [itemId=" + itemId + ", title=" + title + ", author=" + author + ", category=" + category
				+ ", cost=" + cost + ", stock=" + stock + "]";
	}
	

}
