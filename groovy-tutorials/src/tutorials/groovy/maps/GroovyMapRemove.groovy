package tutorials.groovy.maps

class GroovyMapRemove {
	
	static main(args) {
		def student = [name: 'John', surname: 'Doe', age: 17, class: '11C', school: 'Groovy School']
		println student
		
		student.remove('age') // Removing by key
		println student
		
		student = student - [school: 'Groovy School'] // Removing as a arithmetic operation
		println student
	}
}
