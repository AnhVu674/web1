package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
//	@RequestMapping("home")
//	public String home(HttpServletRequest req, HttpServletResponse res) {
//		HttpSession sesstion = req.getSession();
//		String name =req.getParameter("name");
//		System.out.println("hi"+name);
//		sesstion.setAttribute(name, name);
//		return "home";
//	}
	@RequestMapping("home")
	public ModelAndView home(@RequestParam("name") String myName) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("home");
		mav.addObject("name",myName);
		return mav;
	}
}
