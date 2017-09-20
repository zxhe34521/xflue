package org.xflue.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/Sysuser")
public class SysUserController {
	
	
	@RequestMapping(value="/dologin")
	public String dologin(HttpServletResponse response, HttpServletRequest request, Model model) {
		model.addAttribute("userInfo", "1");
		System.out.println("1");
		return "views/showInfo";
	}
	
}
