package tutorials.groovy.maps

class GroovyMapValues {
	
	static main(args) {
		def student = [name: 'John', surname: 'Doe', age: 17]
		def studentValues = student.values()
		
		println studentValues
	}
}
