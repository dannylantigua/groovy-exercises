package tutorials.groovy.arrays

class GroovyArrayOrdering {
	
	static main(args) {
		def birds = ["Parrot", "Cockatiel", "Pigeon"] as String[]
		println birds.reverse()
		println birds.sort()
	}
}
