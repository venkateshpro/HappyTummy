package com.HappyTummy.App.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;




@Entity
@Table
@Component
public class Customer {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
	 	int cus_Id;
		

		String cus_email;
		
		String cus_psw;
		
		String cus_phone;
	
		String cus_name;
		
		@OneToMany(mappedBy = "customer")
		private List<Cart> cart;
		
		

		public Customer() {
			super();
			// TODO Auto-generated constructor stub
		}



		public Customer(int cus_Id, String cus_email, String cus_psw, String cus_phone, String cus_name,
				List<Cart> cart) {
			super();
			this.cus_Id = cus_Id;
			this.cus_email = cus_email;
			this.cus_psw = cus_psw;
			this.cus_phone = cus_phone;
			this.cus_name = cus_name;
			this.cart = cart;
		}



		public int getCus_Id() {
			return cus_Id;
		}



		public void setCus_Id(int cus_Id) {
			this.cus_Id = cus_Id;
		}



		public String getCus_email() {
			return cus_email;
		}



		public void setCus_email(String cus_email) {
			this.cus_email = cus_email;
		}



		public String getCus_psw() {
			return cus_psw;
		}



		public void setCus_psw(String cus_psw) {
			this.cus_psw = cus_psw;
		}



		public String getCus_phone() {
			return cus_phone;
		}



		public void setCus_phone(String cus_phone) {
			this.cus_phone = cus_phone;
		}



		public String getCus_name() {
			return cus_name;
		}



		public void setCus_name(String cus_name) {
			this.cus_name = cus_name;
		}



		public List<Cart> getCart() {
			return cart;
		}



		public void setCart(List<Cart> cart) {
			this.cart = cart;
		}



		@Override
		public String toString() {
			return "Customer [cus_Id=" + cus_Id + ", cus_email=" + cus_email + ", cus_psw=" + cus_psw + ", cus_phone="
					+ cus_phone + ", cus_name=" + cus_name + ", cart=" + cart + "]";
		}
		

		
	
		
		
		
		

		
}
