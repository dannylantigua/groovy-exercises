package tutorials.groovy.maps

class GroovyMapGetWithDefaultValue {
	
	static main(args) {
		def student = [name: 'John', surname: 'Doe', age: 17, class: '11C', school: 'Groovy School']
		def result = student.get('teacher', new Teacher(name: 'Betty'))
		
		println result
	}
}