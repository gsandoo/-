package com.closet.rent;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.closet.san.BoardDTO;
import com.closet.san.BoardService;

@Controller
@RequestMapping("/board/*")
public class BoardController {
	
	@Inject
	BoardService service;
	
	@RequestMapping(value = "/list" , method = RequestMethod.GET)
	 public void getList(Model model) throws Exception{
		List<BoardDTO> list = null;
		list = service.list();
		
		model.addAttribute("list",list);
	}
	
}
