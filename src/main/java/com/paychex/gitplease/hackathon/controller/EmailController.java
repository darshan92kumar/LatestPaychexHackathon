package com.paychex.gitplease.hackathon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.paychex.gitplease.hackathon.models.Quote;
import com.paychex.gitplease.hackathon.service.EmailService;

@Controller
public class EmailController {	
	
	@Autowired
	private EmailService emailServiceImpl;
	
	     
    @RequestMapping("/requestQuote")
    @ResponseBody
    public ModelAndView ModelAndView(@ModelAttribute("quote")Quote quote) {
        try {
        	emailServiceImpl.sendEmail(quote);
            ModelAndView modelAndView = new ModelAndView("index");
            return modelAndView;
        } catch (Exception ex) {
            System.out.println( "Error in sending email: " + ex);
            ModelAndView modelAndView = new ModelAndView("index"); // this should be error ModelandView not index
            return modelAndView;
        }
    } 

}
