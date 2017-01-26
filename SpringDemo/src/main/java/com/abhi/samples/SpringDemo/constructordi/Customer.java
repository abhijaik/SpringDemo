package com.abhi.samples.SpringDemo.constructordi;

public class Customer {
	private String name;
	private int age;
	private Address addr;
	public Customer(String name, int age, Address addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	
	@Override
	public String toString(){
		return name+" is "+age+" years old and living in "+addr.toString();
	}
	

}
