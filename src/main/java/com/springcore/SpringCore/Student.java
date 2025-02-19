package com.springcore.SpringCore;

public class Student {
	private int roll;
	private String prn;
	private String name;
	private String address;
	private String gender;	
	
	public int getRoll(){
		return this.roll;
	}
	public void setRoll(int roll){
		System.out.println("Setting Roll property...");
		this.roll = roll;
	}
	public String getPrn(){
		return this.prn;
	}
	public void setPrn(String prn){
		System.out.println("Setting PRN property...");
		this.prn = prn;
	}
	public String getName(){
			return this.name;
	}
	public void setName(String name){
		System.out.println("Setting Name property...");
		this.name = name;
	}
	public String getAddress(){
			return this.address;
	}
	public void setAddress(String address){
		System.out.println("Setting Address property...");
		this.address = address;
	}
	public String getGender(){
			return this.gender;
	}
	public void setGender(String gender){
		System.out.println("Setting Gender property...");
		this.gender = gender;
	}
	
	@Override
	public String toString(){
		return "Student { \n\troll:"+roll+",\n\tPRN:"+prn+",\n\tName:"+name+",\n\tAddress:"+address+",\n\tGender :"+gender+"\n};";
	}
}
