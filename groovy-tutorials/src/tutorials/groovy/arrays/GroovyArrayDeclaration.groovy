package tutorials.groovy.arrays

class GroovyArrayDeclaration {
	
	static main(args) {
		def birds = new String[3]
		birds[0] = "Parrot"
		birds.putAt(1, "Cockatiel")
		birds[2] = "Pigeon"
		println birds
		
		def birdArr = ["Parrot", "Cockatiel", "Pigeon", "Peacock"] as String[]
		println birdArr
	}
}
