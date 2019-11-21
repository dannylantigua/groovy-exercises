package tutorials.groovy.arrays

class GroovyArrayLookup {
	
	static main(args) {
		def birds = ["Parrot", "Cockatiel", "Pigeon"] as String[]
		def revertedBirds = birds.collect { it.reverse() }
		println revertedBirds
		def founded = birds.find { it =~ /Cockatiel/ }
		println founded
	}
}
