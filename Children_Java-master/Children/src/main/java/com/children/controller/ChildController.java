package com.children.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.children.model.Child;
import com.children.service.ChildrenService;
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
	
	@RequestMapping(value = { "/", "/all" }, method = RequestMethod.GET)
	public String listChildren(ModelMap model) {
		List<Child> children = childrenService.findAllChildren();
		
		model.addAttribute("news", children);
		model.addAttribute("loggedinuser", getPrincipal());
		return "children";
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
