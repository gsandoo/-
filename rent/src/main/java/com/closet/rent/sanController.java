package com.closet.rent;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class sanController {
	@RequestMapping
	public String customerService() {
		return "san/customerService";
	} 
	
}
