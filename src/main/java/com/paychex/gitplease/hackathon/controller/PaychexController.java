package com.paychex.gitplease.hackathon.controller;

import java.util.Map;

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

import com.paychex.gitplease.hackathon.models.SectionCounter;
import com.paychex.gitplease.hackathon.models.ServiceAnalytics;

@Controller
public class PaychexController {	
	
	private ServiceAnalytics serviceAnalytics = ServiceAnalytics.getInstance() ;

	@RequestMapping("/")
	public ModelAndView landingPage() {

		ModelAndView modelAndView = new ModelAndView("index");
		registerForAnalytics("HOME",serviceAnalytics.getAnalyticsMap());
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
	
	@RequestMapping("/contact")
	public ModelAndView contactUsPage() {
		ModelAndView modelAndView = new ModelAndView("contact");
		registerForAnalytics("CONTACT",serviceAnalytics.getAnalyticsMap());
		return modelAndView;
	}
	
	@RequestMapping("/about")
	public ModelAndView aboutUsPage() {
		ModelAndView modelAndView = new ModelAndView("about");
		registerForAnalytics("ABOUT",serviceAnalytics.getAnalyticsMap());
		return intSectionCounter(modelAndView);
	}
	
	@RequestMapping("/project")
	public ModelAndView projectPage() {
		ModelAndView modelAndView = new ModelAndView("project");
		registerForAnalytics("PROJECT",serviceAnalytics.getAnalyticsMap());
		return modelAndView;
	}
	
	@RequestMapping("/services")
	public ModelAndView servicePage() {
		ModelAndView modelAndView = new ModelAndView("services");
		registerForAnalytics("SERVICES",serviceAnalytics.getAnalyticsMap());
		return modelAndView;
	}
	
	@RequestMapping("/blog")
	public ModelAndView blogPage() {
		ModelAndView modelAndView = new ModelAndView("blog");
		registerForAnalytics("BLOG",serviceAnalytics.getAnalyticsMap());
		return modelAndView;
	}
	
	private void registerForAnalytics(String serviceKey, Map<String, Integer> analyticMap) {
		
		for (Map.Entry<String, Integer> entry : analyticMap.entrySet()) {
	        if(entry.getKey().equalsIgnoreCase(serviceKey)) {
	        	int value = entry.getValue();
	        	value++;
	        	analyticMap.put(serviceKey, value);
	        	serviceAnalytics.setAnalyticsMap(analyticMap); 
	        	return;
	        }        
	    }

        analyticMap.put(serviceKey, 1);
        serviceAnalytics.setAnalyticsMap(analyticMap);		
	}
}
