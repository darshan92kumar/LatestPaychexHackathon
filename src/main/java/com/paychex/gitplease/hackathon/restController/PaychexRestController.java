package com.paychex.gitplease.hackathon.restController;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.paychex.gitplease.hackathon.models.SectionCounter;

@RestController
@RequestMapping("/paychex")
public class PaychexRestController {
	
	@Autowired
	Environment environment;
	
	@RequestMapping(value = "/accolades", method = RequestMethod.GET)
	public SectionCounter getAccolades() {
		SectionCounter sc = new SectionCounter();
		// mock service call to get values
		sc.setAwardsReceived(123);
		sc.setProjectsCompleted(123);
		sc.setSatisfiedCustomer(123);
		sc.setYearsOfExperience(40);
	  return sc;
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public List<String> getEndpointList() throws UnknownHostException {
		
		// Port
	    String port = environment.getProperty("local.server.port");
	    // Local address
	    String hostAddress = InetAddress.getLocalHost().getHostAddress();
		
		List<String> endpoints = new ArrayList<>();
		endpoints.add(hostAddress+":"+port+"/actuator");
		endpoints.add(hostAddress+":"+port+"/actuator/health");
		endpoints.add(hostAddress+":"+port+"/paychex/accolades");
		endpoints.add(hostAddress+":"+port+"/paychex/list");
		
		return endpoints;
	}

}
