package com.HappyTummy.App.Service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HappyTummy.App.Model.Item;
import com.HappyTummy.App.Repo.Itemrepository;
@Service
public class ItemService {
	
	@Autowired
	Itemrepository irepository;
	
	
	public void AddItem() {
		
	}
	public List<Item> GetItems() {
		
		
		return irepository.findAll();
		
	}
	public Collection<? extends Item> listofItems() {
		// TODO Auto-generated method stub
		return irepository.findAll();
	}
	public void saveItem(Item item) {
		irepository.save(item);
	}

}
