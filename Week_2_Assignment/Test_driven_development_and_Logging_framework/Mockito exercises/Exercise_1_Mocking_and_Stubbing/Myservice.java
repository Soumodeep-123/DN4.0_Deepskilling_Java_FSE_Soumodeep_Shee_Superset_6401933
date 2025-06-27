package com.example.junit_Mockito_assignment;

public class Myservice {
	private ExternalApi api;
	
	public Myservice(ExternalApi api) {
		this.api = api;
	}
	
	public String fetchdata() {
		return api.getdata();
	}
}
