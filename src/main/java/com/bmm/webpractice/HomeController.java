package com.bmm.webpractice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {
	
	@RequestMapping("/index")
	public String index() {
		
		return "root.index";
	}
	
	@RequestMapping("/help")
	public void help() {
		System.out.println("123413");
	}
	/*
	 * @Override public ModelAndView handleRequest(HttpServletRequest request,
	 * HttpServletResponse response) throws Exception {
	 * 
	 * ModelAndView mv = new ModelAndView("root.index"); mv.addObject("data", "성공");
	 * //mv.setViewName("/WEB-INF/view/index.jsp"); return mv; }
	 */

}
