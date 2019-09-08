package com.paychex.gitplease.hackathon.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.paychex.gitplease.hackathon.models.SectionCounter;

@Controller
public class PaychexController {

	@RequestMapping("/")
	public ModelAndView landingPage() {

		ModelAndView modelAndView = new ModelAndView("index");
		return intSectionCounter(modelAndView);
	}

	private ModelAndView intSectionCounter(ModelAndView modelAndView) {

		SectionCounter sc = new SectionCounter();
		// mock service call to get values
		sc.setAwardsReceived(123);
		sc.setProjectsCompleted(123);
		sc.setSatisfiedCustomer(123);
		sc.setYearsOfExperience(40);

		modelAndView.addObject("AwardsReceived", sc.getAwardsReceived());
		modelAndView.addObject("ProjectsCompleted", sc.getProjectsCompleted());
		modelAndView.addObject("SatisfiedCustomer", sc.getSatisfiedCustomer());
		modelAndView.addObject("ExpYears", sc.getYearsOfExperience());

		return modelAndView;

	}

	@RequestMapping("/adminLoginPage")
	public String adminLoginPage() {
		return "login";
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
