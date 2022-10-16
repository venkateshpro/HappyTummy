package com.HappyTummy.App.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HappyTummy.App.Model.Customer;
import com.HappyTummy.App.Repo.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	CustomerRepository cusrepo;
	
	public void orderfood() {
		
	}

	public List<Customer> listofcustomer() {
		
		return cusrepo.findAll();
		
	}

	public Customer saveuser(Customer customer) {
		return cusrepo.save(customer);
		
		
	}

}
