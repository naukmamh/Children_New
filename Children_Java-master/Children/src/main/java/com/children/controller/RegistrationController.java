package com.children.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.children.model.House;

@Controller
public class RegistrationController {

	@RequestMapping(value={"/registration"}, method=RequestMethod.GET)
	public String registrationRender(Model m){
		m.addAttribute("house", new House());
		return "login";
	}
	@RequestMapping(value={"/registration"}, method=RequestMethod.POST)
	public String register(@Valid House h, BindingResult bindingResult){
        System.out.println("Try..");
		if (!bindingResult.hasErrors()) {
            System.out.println("Ok!");
        }
		return "login";
	}
}
