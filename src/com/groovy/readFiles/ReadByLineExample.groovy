
def file = new File('newFile.txt')

def myArray = file.readLines()
println myArray
println myArray.get(0)
println myArray[1]

for(String temp: myArray) {
	println "Each Line...." + temp
}

myArray.each {
	line -> println line
}