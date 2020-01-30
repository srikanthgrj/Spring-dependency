package com.sri.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sri.spring.Threadexe.Labour;
import com.sri.spring.Threadexe.ThreadIMPL;

public class Deptester {
	public static void main(String[] args) {
		//ThreadIMPL th = new ThreadIMPL();
		//th.start();
		ApplicationContext con = new ClassPathXmlApplicationContext("context.xml");
		Rocket reffofrocket=con.getBean(Rocket.class);
		
		Labour reffoflabour=con.getBean(Labour.class);
		reffofrocket.launch();
		reffoflabour.work();
		
		
		
		
		
		
	}
	

}
