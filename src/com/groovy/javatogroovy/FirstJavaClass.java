package com.groovy.javatogroovy;

public class FirstJavaClass {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String success() {
		return "Success..." + name;
	}
	
	public static void main (String[] args) {
		FirstJavaClass fJava = new FirstJavaClass();
		fJava.setName("Java to Groovy");
		System.out.println(fJava.success());
	}
}
