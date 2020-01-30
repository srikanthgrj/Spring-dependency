package com.sri.spring;

public class Satellite {
	private int lanched;
	private String location;
	
	public Satellite() {
		// TODO Auto-generated constructor stub
		System.out.println("created "+this.getClass().getSimpleName());
	}
	public void setLanched(int lanched) {
		this.lanched = lanched;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	public void launch(int time) {
		
		System.out.println("invoked "+time);
	}
	@Override
	public String toString() {
		return "Satellite [lanched=" + lanched + ", location=" + location + "]";
	}
	

}
