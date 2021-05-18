package com.product.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class ProductController {

	
	
	@RequestMapping("/new")
	public String newproduct(Model model) {
		
		
		 return "newproduct";
}
}