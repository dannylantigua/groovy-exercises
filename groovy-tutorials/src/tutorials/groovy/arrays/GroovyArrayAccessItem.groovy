package tutorials.groovy.arrays

class GroovyArrayAccessItem {
	
	static main(args) {
		
		def birds = ["Parrot", "Cockatiel", "Pigeon"] as String[]
		
		println birds[0]
		println birds[2]
		println birds.getAt(1)
		println birds[-1]
		println birds[-3]
	}
}
