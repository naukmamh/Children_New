package com.children.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainPageController {
	
	@RequestMapping(value={"/"}, method=RequestMethod.GET)
	public ModelAndView getMainPage(){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("index");
		return mav;
	}
}
