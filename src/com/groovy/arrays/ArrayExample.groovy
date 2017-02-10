
// 3 ways of defining arrays
def arrayOne = new String[3];
String[] arrayTwo = ["Test1", "Test2", "Test3"]
def arrayThreee = ["Test1", "Test2", "Test3"] as String[]


// Adding the values in array in different ways
arrayOne[0] = "Array"
arrayOne.putAt(2, "Class")
arrayOne[1] = "Example";

println arrayOne
println arrayOne[1]


// size of array
println arrayTwo.length
println arrayTwo.size()


// Example 1
def arrayInt = [1, 2, 3, 0, 8] as Integer[]
println arrayInt.min()
println arrayInt.max()





