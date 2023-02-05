package com.closet.rent;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.closet.eun.MemberDAO;
import com.closet.eun.MemberDTO;

@Controller
public class eunController {
	@Autowired
	private MemberDAO dao;
	
	@RequestMapping("/join.do")
	public String join() {
		return "eun/join"; // join.jsp 로 이동 시켜준다
	}
	
	@RequestMapping("/join_form.do") // 
	public void joinForm(MemberDTO dto, HttpServletResponse response, HttpServletRequest request) throws IOException {
		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		
		int check = this.dao.insertMember(dto);
		
		if (check > 0) { 
			out.println("<script>");
			out.println("alert('������ �Ϸ�Ǿ����ϴ�!')");
		    out.println("location.href='/'"); 
		    out.println("</script>"); 
		} else {
		    out.println("<script>"); 
		    out.println("alert('������ ������ �߻��߽��ϴ�.')");
		    out.println("history.back()"); 
		    out.println("</script>"); 
		}
	}
}
