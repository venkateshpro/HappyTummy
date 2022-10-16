package com.HappyTummy.App.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.stereotype.Component;
@Entity
@Component
public class Cart {

	@Id
	@GenericGenerator(strategy="increment", name = "")

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int order_id;
	
	@ManyToOne
	private Item item;
	
	@ManyToOne
	private Customer customer;
	
	private String item_name;
	
	private String cus_name;
	private int qty;
	private int price;
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cart(int order_id, Item item, Customer customer, String item_name, String cus_name, int qty, int price) {
		super();
		this.order_id = order_id;
		this.item = item;
		this.customer = customer;
		this.item_name = item_name;
		this.cus_name = cus_name;
		this.qty = qty;
		this.price = price;
	}
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public String getItem_name() {
		return item_name;
	}
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	public String getCus_name() {
		return cus_name;
	}
	public void setCus_name(String cus_name) {
		this.cus_name = cus_name;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	

	
	
	

	

	

	

	
	

}
