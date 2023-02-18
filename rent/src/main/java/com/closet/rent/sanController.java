package com.closet.rent;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.closet.san.BoardBiz;
import com.closet.san.BoardDAO;
import com.closet.san.BoardDTO;

@Controller
public class sanController {
	private static final Logger logger = LoggerFactory.getLogger(sanController.class);
	
	@Autowired
	private BoardDAO dao;
	
	@Autowired
	private BoardBiz biz;
	
	
	@RequestMapping("/list.do")
	public String serviceBoard(Model model) {
		logger.info("SERVICE PAGE");
		
		

		model.addAttribute("list",biz.selectList());
		
		return "san/serviceBoard"; // serviceBoard.jsp 로 이동 시켜준다
	}
	
	// 게시글 누를 시 글 상세 보기
	@RequestMapping("/one.do")
	public void one(Model model, int bdNum ,HttpServletResponse response, HttpServletRequest request) throws IOException {
		logger.info("SELECT ONE");
		
		PrintWriter out = response.getWriter();

		
		HttpSession session = request.getSession();
		// 세션 값 변수에 받기
		String name = (String) session.getAttribute("mem_name");
		System.out.println("DB에서 받은 이름은 : "+name);
		BoardDTO dto = biz.selectOne(bdNum);
		System.out.println(dto.getWriter());
		
		if(name.equals(dto.getWriter())) {
		System.out.println("OK");
		model.addAttribute("dto", dto);
		
		out.println("<script>");
		out.println("alert('Good!')");
	    out.println("location.href='san/selectOne'"); 
	    out.println("</script>"); 
		}else {
			System.out.println("NOT");
			out.println("<script>");
			out.println("alert('no WAY!')");
		    out.println("location.href='/'"); 
		    out.println("</script>"); 
		    
		}
	}
	
	@RequestMapping("/insert.do")
	public String insert() {
		logger.info("INSERT ONE");
		
		return "san/insert";
		
	}
	
	@RequestMapping("/insertBoard.do")
	public void insertBoard(BoardDTO dto,HttpServletResponse response, HttpServletRequest request)throws Exception {
		logger.info("INSERT BOARD");
		PrintWriter out = response.getWriter();
		int res = biz.insert(dto);
		
		if(res > 0) {
			out.println("<script>");
			out.println("alert('article has been written!')");
		    out.println("location.href='/'"); 
		    out.println("</script>");
		}else {
			
			out.println("<script>");
			out.println("alert('article has not been written!')");
		    out.println("location.href='/'"); 
		    out.println("</script>"); 
		}
		
	}

	// 게시글 수정 - 글 제목을 눌렀을 때
	@RequestMapping("/update.do")
	public String update(Model model, int bdNum) {
		
		
		logger.info("UPDATE PAGE");
		BoardDTO dto = biz.selectOne(bdNum);
		model.addAttribute("dto", dto);
		
		return "san/update"; // jsp 이동.
		
	}
	
	@RequestMapping("/updateBoard.do")
	public void updateBoard(BoardDTO dto,HttpServletResponse response, HttpServletRequest request)throws Exception{
		
		logger.info("UPDATE");
		
		PrintWriter out = response.getWriter();
		int res = biz.update(dto);
		
		if(res > 0) {
			out.println("<script>");
			out.println("alert('article has been modified!')");
		    out.println("location.href='/'"); 
		    out.println("</script>");
		}else {
			
			out.println("<script>");
			out.println("alert('article has not been modified!')");
		    out.println("location.href='/'"); 
		    out.println("</script>"); 
		}
		
						
	}
	
	@RequestMapping("/delete.do")
	public void delete(int bdNum,HttpServletResponse response) throws IOException {
		logger.info("DELETE");
		
		PrintWriter out = response.getWriter();

		int res = biz.delete(bdNum);

		if(res > 0) {
			out.println("<script>");
			out.println("alert('article has been deleted!')");
		    out.println("location.href='/'"); 
		    out.println("</script>");
		}else {
			
			out.println("<script>");
			out.println("alert('article has not been deleted!')");
		    out.println("location.href='/'"); 
		    out.println("</script>"); 
		}
		
	};

	
}


