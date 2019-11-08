package tutorials.groovy.maps

class GroovyMapIntersect {
	
	static main(args) {
		def student1 = [name: 'John', surname: 'Doe', age: 17]
		def student2 = [surname: 'Bunny', age: 17]
		def sameProperties = student1.intersect(student2)
		
		println sameProperties
	}
}
