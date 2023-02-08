package com.closet.rent;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
	public String one(Model model, int bdNum) {
		logger.info("SELECT ONE");
		
		model.addAttribute("dto",biz.selectOne(bdNum));
		
		return "san/selectOne";
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
			out.println("alert('글이 작성 되었습니다!')");
		    out.println("location.href='/'"); 
		    out.println("</script>");
		}else {
			
			out.println("<script>");
			out.println("alert('글이 작성 되지 않았습니다!')");
		    out.println("location.href='/'"); 
		    out.println("</script>"); 
		}
		
	}

	// 게시글 수정
	@RequestMapping("/update.do")
	public String update(Model model, int bdNum) {
		
		logger.info("UPDATE PAGE");
		
		model.addAttribute("dto",biz.selectOne(bdNum));
		
		return "san/update";
		
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

}


