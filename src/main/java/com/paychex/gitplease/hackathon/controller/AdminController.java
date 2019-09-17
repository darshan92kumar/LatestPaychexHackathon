package com.paychex.gitplease.hackathon.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.paychex.gitplease.hackathon.models.ServiceAnalytics;

@Controller
public class AdminController {
	
	private ServiceAnalytics serviceAnalytics = ServiceAnalytics.getInstance() ;
	
	@RequestMapping("/adminLoginPage")
	public ModelAndView adminLoginPage() {
		
		ModelAndView modelAndView = new ModelAndView("login");
		return modelAndView;
	}
	
	@RequestMapping("/admin")
	@Secured("ADMIN")
	public ModelAndView adminPage() {
		
		ModelAndView modelAndView = new ModelAndView("admin");
		modelAndView.addObject("Home", serviceAnalytics.getAnalyticsMap().get("HOME") == null ? 0 : serviceAnalytics.getAnalyticsMap().get("HOME"));
		modelAndView.addObject("About", serviceAnalytics.getAnalyticsMap().get("ABOUT") == null ? 0 : serviceAnalytics.getAnalyticsMap().get("ABOUT"));
		modelAndView.addObject("Projects", serviceAnalytics.getAnalyticsMap().get("PROJECT") == null ? 0 : serviceAnalytics.getAnalyticsMap().get("PROJECT"));
		modelAndView.addObject("Services", serviceAnalytics.getAnalyticsMap().get("SERVICES") == null ? 0 : serviceAnalytics.getAnalyticsMap().get("SERVICES"));
		modelAndView.addObject("Blog", serviceAnalytics.getAnalyticsMap().get("BLOG") == null ? 0 : serviceAnalytics.getAnalyticsMap().get("BLOG"));
		modelAndView.addObject("Contact", serviceAnalytics.getAnalyticsMap().get("CONTACT") == null ? 0 : serviceAnalytics.getAnalyticsMap().get("CONTACT"));
		return modelAndView;
	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logoutPage(HttpServletRequest request, HttpServletResponse response) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (auth != null) {
			new SecurityContextLogoutHandler().logout(request, response, auth);
		}
		return "redirect:/";
	}

}
