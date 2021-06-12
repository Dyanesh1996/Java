package com.telusko;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.telusko.service.AddService;

@Controller		//To make this class a controller

public class AddController {
	@RequestMapping("/add")			//To determine for which kind of request we need to call any method
	
	public ModelAndView add(HttpServletRequest request, HttpServletResponse response) {
		
		int i = Integer.parseInt(request.getParameter("t1"));
		int j = Integer.parseInt(request.getParameter("t2"));
		
		AddService as = new AddService();
		int k = as.add(i, j);
		
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Display.jsp");
		mv.addObject("Result", k);
		
		
		return mv;
	}
}
