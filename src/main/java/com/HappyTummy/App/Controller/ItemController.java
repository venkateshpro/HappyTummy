package com.HappyTummy.App.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.HappyTummy.App.Model.Item;
import com.HappyTummy.App.Service.ItemService;

@RestController
public class ItemController {
	
	@Autowired
	ItemService itemservice;
	
	@GetMapping("/itemlist")//qty select by user 
	public ModelAndView ItemList() {
		List<Item> items= new ArrayList<>();
		
		items.addAll(itemservice.GetItems());
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("itemlist",items);
		mv.setViewName("itemlist.jsp");
		

		return mv;
		
		
	}
	@GetMapping("/listof_items")//Admin list of items
	public ModelAndView listofItems() {
		ModelAndView mv = new ModelAndView();
		List<Item> Itemlist= new ArrayList<>();
		
		Itemlist.addAll(itemservice.listofItems());
		mv.addObject("itemlist", Itemlist);
		mv.setViewName("ListOfItem.jsp");
		return mv;
	}
	@PostMapping("/additem")
	public String adduser(@ModelAttribute Item item) {
		
		itemservice.saveItem(item);
		
		
		
		return "Item  Added succesfully";
		
	}

	
	
}
