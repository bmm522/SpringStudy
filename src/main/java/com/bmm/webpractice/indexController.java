package com.bmm.webpractice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;


public class indexController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		ModelAndView mv = new ModelAndView("root.index");
		mv.addObject("data", "성공");
		//mv.setViewName("/WEB-INF/view/index.jsp");
		return mv;
	}

}
