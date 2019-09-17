package com.paychex.gitplease.hackathon.service;

import javax.mail.MessagingException;

import com.paychex.gitplease.hackathon.models.Quote;

public interface EmailService {
	
	public void sendEmail(Quote quote) throws MessagingException;

}
