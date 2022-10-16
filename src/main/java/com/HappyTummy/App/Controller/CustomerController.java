package com.HappyTummy.App.Controller;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.HappyTummy.App.Model.Customer;
import com.HappyTummy.App.Repo.CartRepository;
import com.HappyTummy.App.Service.CustomerService;


@RestController
public class CustomerController {
	String cusname;
	int cusid;
	
	@Autowired
	ItemController ic;
	
	@Autowired 
	CustomerService customerservice;
	
	@Autowired
	CartRepository orderRepository;
	@PostMapping("/takeorder")
	public ModelAndView orderfood(@RequestParam(value = "itemname", required = false) String itemname,@RequestParam(value = "item_id", required = false) int item_id,
			@RequestParam(value = "qty", required = false) int qty,@RequestParam(value = "price", required = false) int price) {
		
		
		System.out.println(itemname);
		System.out.println(qty);
		System.out.println(item_id);
		System.out.println(price);
		System.out.println(cusname);
		System.out.println();
		orderRepository.insertOrder(cusname,cusid,itemname,qty,item_id,price);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("cart.jsp");
		return mv;
	}
	
	
	public void customerdetails(String cus_name, int cus_id) {
		cusname= cus_name;
		cusid=cus_id;
		
	}
	
	@GetMapping("/getlistofcustomers")
	public ModelAndView listofcus() {
		
		ModelAndView mv = new ModelAndView();

		List<Customer> cuslist= new ArrayList<>();
		cuslist.addAll(customerservice.listofcustomer());
		mv.addObject("cuslist", cuslist);
		mv.setViewName("CustomerList.jsp");
		return mv;
		
	}
	@PostMapping("/adduser")
	public String adduser(@ModelAttribute Customer customer) {
		customerservice.saveuser(customer);
		
		
		
		
		return "User Added succesfully";
		
	}

}
