package com.groovy.basic

import org.codehaus.groovy.runtime.typehandling.GroovyCastException

class Variables {
	
	static main(args) {
		
		// static typing
		int firstNumber = 5
		println firstNumber
		
		firstNumber = "hello" 
		println firstNumber 
		
		
		def lastName = 5
		println lastName
		
		lastName = "moses"
		println lastName
	}
}
