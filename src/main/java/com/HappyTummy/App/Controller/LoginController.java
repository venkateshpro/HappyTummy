package com.HappyTummy.App.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.HappyTummy.App.Model.Customer;
import com.HappyTummy.App.Repo.CustomerRepository;

@RestController
public class LoginController {
	
	int cus_id;
	
	@Autowired
	CustomerRepository cusrepository;
	
	@Autowired
	CustomerController cc;
	
	

	String cus_name;
	
	@GetMapping("/")
	public ModelAndView login() {
		ModelAndView modelAndView = new ModelAndView();

		modelAndView.setViewName("Login.jsp");
		return modelAndView;
	}
	@PostMapping(value = "/validate")
	public ModelAndView validate_customer(@RequestParam(value = "email", required = false) String email,
			@RequestParam(value = "psw", required = false) String psw,@RequestParam(value = "role", required = false) String role) {
		Customer cus = cusrepository.findByEmailAndPassword(email, psw);
		String ch;
		
			ch=role;
			switch(ch) {
			case "customer":
				if (cus != null) {
					System.out.println("iam in customer");
					cus_id=cus.getCus_Id();
					cus_name=cus.getCus_name();
					System.out.println(cus_name);
					cc.customerdetails(cus_name,cus_id);
					
					ModelAndView modelAndView = new ModelAndView();
					modelAndView.addObject("name", cus_name);
					modelAndView.addObject("id", cus_id);

					modelAndView.setViewName("index.jsp");
					return modelAndView;
					
					
				}
				else { 
					System.out.println("Wrong credentails");
;
				}	
			
			case "admin":
				System.out.println("iam in admin");
				if (cus != null) {
					ModelAndView modelAndView = new ModelAndView();

					modelAndView.setViewName("Admin.jsp");
					return modelAndView;
				}
				else {
					System.out.println("Wrong credentails");
				}
			}
			return null;
			
		
	}


}
