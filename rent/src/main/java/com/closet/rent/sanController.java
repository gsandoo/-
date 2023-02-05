package com.closet.rent;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.closet.san.BoardDAO;
import com.closet.san.BoardDTO;

@Controller
public class sanController {
	@Autowired
	private BoardDAO dao;
	
	@RequestMapping("/list.do")
	public String join() {
		return "san/list"; // list.jsp 로 이동 시켜준다
	}
	
	@RequestMapping("/list_form.do") // 
	public void joinForm(BoardDTO dto, HttpServletResponse response, HttpServletRequest request) throws IOException {
		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		
		int check = this.dao.insertBoard(dto);
		
		if (check > 0) { 
			out.println("<script>");
			out.println("alert('글이 작성 되었습니다!')");
		    out.println("location.href='/'"); 
		    out.println("</script>"); 
		} else {
		    out.println("<script>"); 
		    out.println("alert('글이 작성되지 않았습니다!')");
		    out.println("history.back()"); 
		    out.println("</script>"); 
		}
	}
}
