package com.children.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.children.dao.WishDao;
import com.children.model.Wish;
@Controller
public class HouseCabinetController {
	@Autowired
	private WishDao wishDao;
	@RequestMapping(value={"/house"}, method=RequestMethod.GET)
	public ModelAndView getHouseCabinet(){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("house-cabinet");
		return mav;
	}
	@RequestMapping(value={"/addWish"}, method=RequestMethod.POST)
	public String addWish(Model m, @Valid Wish w, BindingResult bindingResult){
		if(bindingResult.hasErrors()){
			m.addAttribute("error",bindingResult.getAllErrors().get(0));
			return "/child?id="+w.getChild().getId();
		}
		wishDao.save(w);
		System.out.println("Success");
		return "WishAdded";
	}
}
