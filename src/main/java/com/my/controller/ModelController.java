package com.my.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/next")
public class ModelController {
	
	@RequestMapping(value="/more")
	public ModelAndView returnModel(){
		ModelAndView model = new ModelAndView();
		model.setViewName("index");	
		model.addObject("message", "This is a test!");
		return model;
	}

	
}
