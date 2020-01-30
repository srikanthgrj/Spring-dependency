package com.sri.spring.Threadexe;

public class Labour {
	
	private String name;
	private int expereance;
	private ThreadIMPL threadIMPL;
	
	
	public Labour(String name) {
		this.name = name;
		System.out.println("created "+name);
	}
	public void setExpereance(int expereance) {
		this.expereance = expereance;
		System.out.println("created "+expereance);
	}
	public void setThreadIMPL(ThreadIMPL threadIMPL) {
		this.threadIMPL = threadIMPL;
		System.out.println("created "+threadIMPL);
	}
	public void work() {
		this.threadIMPL.start();
		this.threadIMPL.run();
	}
	

}
