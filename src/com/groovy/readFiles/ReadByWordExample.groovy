
def file = new File('newFile.txt')

file.readLines().each {
	line -> line.tokenize().each {
		word -> if(word == 'love') {
			println word
		}
	}
}


file.readLines().each {
	line -> line.tokenize().each {
		word -> println word
		
	}
}