
// Empty Map
def mapVariable = [:]

// Adding value
mapVariable.put('Color', 'red')
println mapVariable.size()
println mapVariable


mapVariable['myValue'] = '5'
println mapVariable.size()
println mapVariable

// property method to add any key value pair
mapVariable.length = '40'
println mapVariable.size()
println mapVariable

mapVariable << ['width':'34']
println mapVariable.size()
println mapVariable




// Retrieve data
println mapVariable['myValue']
println mapVariable.myValue
println mapVariable.get('myValue')



