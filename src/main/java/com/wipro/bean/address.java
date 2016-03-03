package com.wipro.bean;

public class address 
{
	String eid;
   String street;
   String city;
   String landmark;
   String state;
   String pin;
   
 //  EmployeeBean e=new EmployeeBean();

public String getEid() {
	return eid;
}

public void setEid(EmployeeBean e) {
	this.eid = e.getEid();
}

public String getStreet() {
	return street;
}

public void setStreet(String street) {
	this.street = street;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public String getLandmark() {
	return landmark;
}

public void setLandmark(String landmark) {
	this.landmark = landmark;
}

public String getState() {
	return state;
}

public void setState(String state) {
	this.state = state;
}

public String getPin() {
	return pin;
}

public void setPin(String pin) {
	this.pin = pin;
}
   
	
	
}
