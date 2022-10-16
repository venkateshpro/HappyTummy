package com.HappyTummy.App.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.HappyTummy.App.Model.Cart;
import com.HappyTummy.App.Repo.CartRepository;

@Service
public class CartService {
	
	@Autowired
	CartRepository orderRepository;
	
	public List<Cart> listorder(int cusid) {
		
		return orderRepository.findByCustomer_Cus_Id(cusid);
	}

	public List<Cart> listoforders() {
		return orderRepository.findAll();
	}

	

}
