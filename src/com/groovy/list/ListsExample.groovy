
def myList = []
println myList.size()

def myList1 = new ArrayList<String>()


// List with initial value
def myList2 = [2,4,6,7,8]


// Adding values to list
myList.add("Richard")
myList << "Ramya"
// To add values always at the end
myList.push("TalluBabby")
println myList

// Add a new value at specific index
myList.putAt(1, "Tannu")
println myList


//Retrieve value from List
println myList[1]
println myList.get(2)
println myList.getAt(0)
// negative index
//list[-1] = list[list.size()+(negative value)] => list[3+(-1)]
println myList[-3]


// Removing values from List
println myList

println myList.remove("Tannu")
println myList

myList.add("Tannu")
myList.add("Babby")
println myList

println myList.remove(2)
println myList

myList = myList - "Richard"
println myList


// Count same kind of data inside the list
def listTemp = [1,3,4,5,6,3,1,4]
println listTemp.count(3)
println listTemp.count(4)

println listTemp.sort()



// merge
def listTemp1 = [5,6,4,[1,2], 4,5,[3,4,5,6,6]]
println listTemp1.flatten()











