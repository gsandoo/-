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
	public String one(Model model, int bdNum,HttpServletResponse response, HttpServletRequest request) throws IOException {
		logger.info("SELECT ONE");
		logger.info("UPDATE visit");

		PrintWriter out = response.getWriter();
		
		
		
		HttpSession session = request.getSession();
		String name = (String) session.getAttribute("mem_name");
		
		// 조회수 증가
		BoardDTO dto  = biz.selectOne(bdNum);
		int num = dto.getBdNum();
		int count = biz.updateVisit(num, dto);
		System.out.println(count);
		
		
		System.out.println("세션 값으로 받아온 이름은:" + name);
		
		if(name!=null) {
			String writer = dto.getWriter();
			System.out.println("게시글 작성자의 이름은:" + writer);
			
			// 세션값이랑 이름이 같은지 비교
			if(name.equals(writer)) {
			    session.setAttribute("writer", dto.getWriter()); // 세션에 값 넣기
			    return "san/selectOne";
			}else {
					return "san/selectOne";
				}
		}else {
			model.addAttribute("dto", dto);
			return "san/selectOne";
		}
		
		
		
	}
	
	@RequestMapping("/insert.do")
	public String insert(Model model,HttpServletRequest request) {
		logger.info("INSERT ONE");
		HttpSession session = request.getSession();
		String writer = (String) session.getAttribute("mem_name");
		model.addAttribute("writer", writer );
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

	// 게시글 수정
	@RequestMapping("/update.do")
	public String update(Model model, int bdNum) {
		
		logger.info("UPDATE PAGE");
		
		BoardDTO dto = biz.selectOne(bdNum);
		model.addAttribute("dto", dto);
		
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


