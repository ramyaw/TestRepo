package com.groovy.javatogroovy

class FirstJavaClassToGroovy {
	def name
	
	def success() {
		return "Success..." + name
	}
	
	static void main (String[] args) {
		def fJava = new FirstJavaClassToGroovy()
		fJava.name = "Java to Groovy"
		println(fJava.success())
	}
}
