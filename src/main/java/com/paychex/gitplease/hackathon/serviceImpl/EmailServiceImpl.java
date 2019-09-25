package com.paychex.gitplease.hackathon.serviceImpl;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.paychex.gitplease.hackathon.config.TemplateConfig;
import com.paychex.gitplease.hackathon.models.Quote;
import com.paychex.gitplease.hackathon.service.EmailService;

@Service
public class EmailServiceImpl implements EmailService {
	
	
	public static final String name = "<NAME>";
	public static final String price = "<PRICE>";
	public static final String service = "<SERVICE>";
	
	@Autowired
    private JavaMailSender sender;

	@Override
	public void sendEmail(Quote quote) throws MessagingException {
		
		 	MimeMessage message = sender.createMimeMessage();
	        MimeMessageHelper helper = new MimeMessageHelper(message);
	         
	        helper.setTo(quote.getEmail());
	        helper.setText(setText(quote),true); // This will be dynamic in future
	        helper.setSubject("Quote from paychex for your requested service "+quote.getService());
	        System.out.println("Sending email to "+quote.getFirstName()+","+quote.getLastName());
	         
	        sender.send(message);
	        System.out.println("Email Sent !");	

	}

	private String setText(Quote quote) {
		
		String emailTemplate = TemplateConfig.getTemplate();
		
		return emailTemplate.replace(name, quote.getFirstName()+" "+quote.getLastName()).replace(price, "50,000").replace(service, quote.getService());
	}

}
