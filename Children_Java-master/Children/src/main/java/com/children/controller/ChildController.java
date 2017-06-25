package com.children.controller;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.children.model.Child;
import com.children.model.House;
import com.children.service.ChildrenService;
import com.children.service.HouseService;
import com.children.service.UserProfileService;
import com.children.service.UserService;

@Controller
@SessionAttributes("roles")
public class ChildController {
	@Autowired
	UserService userService;

	@Autowired
	UserProfileService userProfileService;

	@Autowired
	MessageSource messageSource;
	
	@Autowired
	ChildrenService childrenService;
	
	@Autowired
	HouseService houseService;

	@Transactional
	@RequestMapping(value = { "/all" }, method = RequestMethod.GET)
	public String listChildren(ModelMap model, @RequestParam Map<String,String> filters) {
	List<Child> children;
	if(filters.size()>0){
		filters.values().removeAll(Collections.singleton(""));
		children = childrenService.findAllChildrenWithFilters(filters);
	} else{
		children = childrenService.findAllChildren();
	}
		model.addAttribute("children", children);
		model.addAttribute("loggedinuser", getPrincipal());
		
		
		//to test search
//		Map f = new HashMap<String,String>();
//		f.put("age", "18");
//		f.put("city", "Kiev");
//		List res = childrenService.findAllChildren();
//		model.addAttribute("children", res);
		return "children";
	}

@Transactional
@RequestMapping(value = { "/child" }, method = RequestMethod.GET)
public String oneChildren(ModelMap model, @RequestParam("id") int id) {
	Child child = childrenService.findById(id);
	model.addAttribute("child", child);
	model.addAttribute("age", childrenService.getAge(child));
	model.addAttribute("wishes",childrenService.formatCarouselWishes(child.getWishes()));
	model.addAttribute("loggedinuser", getPrincipal());
	return "child";
}


	private String getPrincipal() {
		String userName = null;
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

		if (principal instanceof UserDetails) {
			userName = ((UserDetails) principal).getUsername();
		} else {
			userName = principal.toString();
		}
		return userName;
	}

}
