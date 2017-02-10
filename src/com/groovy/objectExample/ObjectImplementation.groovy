import com.groovy.objectExample.ObjectExample
import com.groovy.objectExample.ObjectExample1

	
	def objectOne = new ObjectExample1()
	objectOne.methodOne()
	
	
	def objectwo = new ObjectExample1(name: 'Riche', place: 'Minneapolis')
	println("name:" + objectwo.getName())
	println("place:" + objectwo.getPlace())
	
	objectwo.setName("Richard")
	println("name:" + objectwo.getName())
	
	
	/*
	 *  When a constructor is defined in Groovy, default constructor cannot be called.
	 *  If you want th call the default constructor, then it should be defined
	 */
	def test = new ObjectExample("RamyaRichard", "MN")
	test.methodOne();
	
	def test1 = new ObjectExample()
