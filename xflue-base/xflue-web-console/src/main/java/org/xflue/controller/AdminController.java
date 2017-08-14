package org.xflue.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.xflue.service.UserService;

@Controller
@RequestMapping(value = "/ftptool")
public class AdminController {
	@Autowired
	UserService userService;
	
	@RequestMapping(value="/addadmin")
	public String toIndex(HttpServletResponse response, HttpServletRequest request, Model model) {
		model.addAttribute("userInfo", userService.show());
		System.out.println("22222222222");
		return "showInfo";
	}

}
