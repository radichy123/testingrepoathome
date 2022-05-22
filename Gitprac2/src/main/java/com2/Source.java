package com2;

public class Source {
	//for registration
	 //encapsulatiion
	void getData() {
		int a=4;
		System.out.println("nsjnd");
		String s=" ";
	}
	//data hiding
	//every time we have source class 
	 private String fname;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	private String lname;
	

}
