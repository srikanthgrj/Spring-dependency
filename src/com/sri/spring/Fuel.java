package com.sri.spring;

public class Fuel {
	
	private int leters;

	public Fuel(int leters) {
		this.leters = leters;
		
		System.out.println("created "+leters);
	}
	public void fire() {
		System.out.println("invoked ");
	}
	@Override
	public String toString() {
		return "Fuel [leters=" + leters + "]";
	}
	
	

}
