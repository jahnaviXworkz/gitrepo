package com.xworkz.app;

public class Ash extends Coal {
	@Override
	public void burn() {
		System.out.println("invoking no arg burn in ash");
		super.burn();
	}

	
	
}
