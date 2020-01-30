package com.sri.spring;

public class Rocket {
	private Fuel fu;
	private Satellite sat;
	private String countryname;
	public Rocket(Fuel fu) {
		this.fu = fu;
		System.out.println("created "+fu);
	}
	
	public void setSat(Satellite sat) {
		this.sat = sat;
		System.out.println("created "+sat);
	}
	public void setCountryname(String countryname) {
		this.countryname = countryname;
		System.out.println("created "+countryname);
	}
	
	public void start() {
		
		this.fu.fire();
	}
	public void launch() {
		this.sat.launch(22);
	}

	@Override
	public String toString() {
		return "Rocket [fu=" + fu + ", sat=" + sat + ", countryname=" + countryname + "]";
	}

}
