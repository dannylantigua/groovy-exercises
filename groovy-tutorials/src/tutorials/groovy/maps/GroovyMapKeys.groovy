package tutorials.groovy.maps

class GroovyMapKeys {
	
	static main(args) {
		def student = [name: 'John', surname: 'Doe', age: 17]
		def studentKeys = student.keySet()
		
		println studentKeys
	}
}
