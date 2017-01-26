package com.abhi.samples.SpringDemo.constructordi;

public class Address {
	
	private String addrLine1;
	private String city;
	private String state;
	
	public Address(String addrLine1, String city, String state) {
		super();
		this.addrLine1 = addrLine1;
		this.city = city;
		this.state = state;
	}
	
	@Override
	public String toString() {
		return addrLine1+" in the "+city +" city of "+state;
	}
}
