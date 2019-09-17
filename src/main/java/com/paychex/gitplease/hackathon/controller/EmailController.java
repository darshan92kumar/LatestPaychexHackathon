package com.paychex.gitplease.hackathon.controller;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.paychex.gitplease.hackathon.models.Quote;

@Controller
public class EmailController {
	
	@Autowired
    private JavaMailSender sender;
     
    @RequestMapping("/requestQuote")
    @ResponseBody
    public ModelAndView ModelAndView(@ModelAttribute("quote")Quote quote) {
        try {
            sendEmail(quote);
            ModelAndView modelAndView = new ModelAndView("index");
            return modelAndView;
        } catch (Exception ex) {
            System.out.println( "Error in sending email: " + ex);
            ModelAndView modelAndView = new ModelAndView("index"); // this should be error ModelandView not index
            return modelAndView;
        }
    }
 
    private void sendEmail(Quote quote) throws Exception{
        MimeMessage message = sender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message);
         
        helper.setTo(quote.getEmail());
        helper.setText("Our quoted price is 80,000$ for your requested service: "+quote.getService()); // This will be dynamic in future
        helper.setSubject("Quote from paychex for your requested service "+quote.getService());
        System.out.println("Sending email to "+quote.getFirstName()+","+quote.getLastName());
         
        sender.send(message);
        System.out.println("Email Sent !");
    }

}
