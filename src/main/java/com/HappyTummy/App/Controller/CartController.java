package com.HappyTummy.App.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.HappyTummy.App.Model.Cart;
import com.HappyTummy.App.Repo.CartRepository;
import com.HappyTummy.App.Service.CartService;

@RestController
public class CartController {
	int cusid;

	
	@Autowired
	CartService roderservice;
	
	@Autowired
	LoginController lc;
	@Autowired
	CartService cartservice;
	
	@Autowired
	CartRepository orderrepo;
	

	@GetMapping("/usercart")//list of items added by particular customer
	public ModelAndView cartByuser() {
		ModelAndView mv = new ModelAndView();

		List<Object>  orderlist= new ArrayList<>();
		System.out.println(lc.cus_id);
		orderlist.addAll(roderservice.listorder(lc.cus_id));
		System.out.println(orderlist);
		mv.addObject("orderlist" ,orderlist);
		mv.setViewName("usercart.jsp");///h
		return mv;
		
	}
	@GetMapping("/listoforders")//Admin
	public ModelAndView listoforders() {
		ModelAndView mv = new ModelAndView();

		List<Cart> cartlist= new ArrayList<>();
		
		cartlist.addAll(cartservice.listoforders());
		
		mv.addObject("orderlist" ,cartlist);
		mv.setViewName("usercart.jsp");
		
		return mv;
		
		
	}
	
}
