package com.HappyTummy.App.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.stereotype.Component;


@Entity
@Component
public class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int item_id;
	
	int price;
	
	String item_name;
	

	
	String description;
	
	@OneToMany(mappedBy = "item")
	private List<Cart> order;

	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Item(int item_id, int price, String item_name, String description, List<Cart> order) {
		super();
		this.item_id = item_id;
		this.price = price;
		this.item_name = item_name;
		this.description = description;
		this.order = order;
	}

	public int getItem_id() {
		return item_id;
	}

	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getItem_name() {
		return item_name;
	}

	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Cart> getOrder() {
		return order;
	}

	public void setOrder(List<Cart> order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return "Item [item_id=" + item_id + ", price=" + price + ", item_name=" + item_name + ", description="
				+ description + ", order=" + order + "]";
	}


	

}
