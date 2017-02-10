package com.groovy.objectExample

class ObjectExample {
	
	String name
	String place
	
	ObjectExample() {
		println "Default Constructor.."	
	}
	
	ObjectExample(name, place) {
		this.name = name
		this.place = place
	}
	
	def methodOne() {
		println "Name:" + name + " /Place:" + place
 	}

}
