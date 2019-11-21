package tutorials.groovy.arrays

class GroovyArrayConversion {
	
	static main(args) {
		def birds = ["Parrot", "Cockatiel", "Pigeon"] as String[]
		def birdList = birds.toList()
		println birdList.class.name
		def birdsAgain =  birdList as String[]
		println birdsAgain.class.name
	}
}
