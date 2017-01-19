package com.controller;

/* Phani Sravan Kolapalli */

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Main {
 @RequestMapping(value = {"/login"}, method = RequestMethod.GET)
 public String view(HttpServletRequest request,HttpServletResponse res)
 {
	 return "login";
}
 @RequestMapping(value = {"/submit"}, method = RequestMethod.POST)
 public String validate(HttpServletRequest request,HttpServletResponse res)
 {
		
String username=request.getParameter("username");
String password=request.getParameter("password");
if((username.equals("phani")) && (password.equals("sravan"))==true)
{
	return "success";
}
else 
{
	return "failure";
}
	
			
 }
}
