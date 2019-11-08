package tutorials.groovy.maps

class GroovyMapAddValues {
	
	static main(args) {
		def student = [:] // Initialize empty map
		student.put('name', 'John') // java notation
		student['surname'] = 'Doe' // You can state key in square brackets. Also used for updating the value
		student << [age: 17] // This is something output redirection in unix commands. key-value pair put inside map object
		student.class = '11C' // Dot notation is also available
		student.'school' = 'Groovy School' // Same as previous
		
		println student
	}
}
