package com.children.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

public class UserCabinetController {
	@RequestMapping(value={"/user"}, method=RequestMethod.GET)
	public ModelAndView getUserCabinet(){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("user-cabinet");
		return mav;
	}
}
