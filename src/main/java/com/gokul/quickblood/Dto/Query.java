package com.gokul.quickblood.Dto;

public class Query {

	private String bloodgroup;
	private String location;
	
	protected Query() {
		
	}

	public String getBloodgroup() {
		return bloodgroup;
	}

	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
