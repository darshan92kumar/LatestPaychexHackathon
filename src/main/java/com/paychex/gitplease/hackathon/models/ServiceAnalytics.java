package com.paychex.gitplease.hackathon.models;

import java.util.HashMap;
import java.util.Map;

public class ServiceAnalytics {

	private static ServiceAnalytics serviceAnalytics = null;

	private Map<String, Integer> analyticsMap;

	public static ServiceAnalytics getInstance() {
		if (serviceAnalytics == null)
			serviceAnalytics = new ServiceAnalytics();

		return serviceAnalytics;
	}
	
	private ServiceAnalytics() { 
		analyticsMap = new HashMap<>(); 
    } 

	public Map<String, Integer> getAnalyticsMap() {
		return analyticsMap;
	}

	public void setAnalyticsMap(Map<String, Integer> analyticsMap) {
		this.analyticsMap = analyticsMap;
	}

}
