package com.my.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.my.entity.Role;
import com.my.server.RoleServer;
import com.my.server.impl.RoleServerImpl;

@Controller
@RequestMapping(value = "/user")
public class UserController {
	
	@Resource
	private RoleServer roleServer;
	@RequestMapping(value = "/test")
	public String recruitdemand(final HttpServletRequest request, final HttpServletResponse response) {
		String name = roleServer.getRoleById("1").getRoleName();
		request.setAttribute("message", "Welcome:" + name);
		
		return "index1";
	}
	

}