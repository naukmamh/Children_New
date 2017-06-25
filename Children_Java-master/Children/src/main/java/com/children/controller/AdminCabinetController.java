package com.children.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

public class AdminCabinetController {

	@RequestMapping(value={"/admin"}, method=RequestMethod.GET)
	public ModelAndView getAdminCabinet(){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("admin-cabinet");
		return mav;
	}
}
