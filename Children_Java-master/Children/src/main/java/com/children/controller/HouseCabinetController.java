package com.children.controller;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.children.dao.WishCategoryDao;
import com.children.model.Wish;
import com.children.service.ChildrenServiceImpl;
import com.children.service.WishService;

@Controller
public class HouseCabinetController {
	@Autowired
	private WishService wishDao;
	@Autowired
	private WishCategoryDao wcDAO;
	@Autowired
	private ChildrenServiceImpl child;
	
	@RequestMapping(value={"/house"}, method=RequestMethod.GET)
	public ModelAndView getHouseCabinet(){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("house-cabinet");
		return mav;
	}
	@Transactional(readOnly=false)
	@RequestMapping(value={"/addWishMyOwn"}, method=RequestMethod.GET)
	public String addWish(Model m, @RequestParam(name="categoryWish", required=false) String wishCategory,@RequestParam("childId") int childId, @Valid Wish w, BindingResult bindingResult){
		if(bindingResult.hasErrors()||wishCategory==null){
			System.out.println("/child?id="+childId);
			m.addAttribute("error",bindingResult.getAllErrors().get(0));
			return "redirect:/child?id="+childId;
		}
		w.setCategory(wcDAO.findByName(wishCategory));
		w.setChild(child.findById(childId));
		wishDao.saveWish(w);
		return "redirect:/child?id="+childId;
	}
}
