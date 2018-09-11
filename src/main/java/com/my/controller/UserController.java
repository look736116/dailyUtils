package com.my.controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/user")
public class UserController {
    @RequestMapping(value = "/test" )
    public String recruitdemand(final HttpServletRequest request,
            final HttpServletResponse response)
    {
    	System.out.println("+====");
        return "index";
    }

}