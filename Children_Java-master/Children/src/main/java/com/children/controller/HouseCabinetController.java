package com.children.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

public class HouseCabinetController {
	@RequestMapping(value={"/house"}, method=RequestMethod.GET)
	public ModelAndView getHouseCabinet(){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("house-cabinet");
		return mav;
	}
}
