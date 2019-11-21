package tutorials.groovy.arrays

class GroovyArrayRemoveItem {
	
	static main(args) {
		def birds = ["Parrot", "Cockatiel", "Pigeon"] as String[]
		def birdsWithoutParrot = birds - "Parrot"
		println birds
		println birdsWithoutParrot
	}
}
