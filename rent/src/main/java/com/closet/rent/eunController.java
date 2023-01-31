package com.closet.rent;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class eunController {
	
	@RequestMapping("/join.do")
	public String join() {
		return "eun/join";
	}
	
	@RequestMapping("/join_form.do")
	public String joinForm() {
		
		
		
		return "eun/joinOk";
	}
}
