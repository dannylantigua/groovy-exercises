package tutorials.groovy.arrays

class GroovyArrayMinMax {
	
	static main(args) {
		def numbers = [32, 44, 12, 9, 100, 180]
		println numbers.max()
		println numbers.min()
		
		def birds = ["Parrot", "Cockatiel", "Pigeon"] as String[]
		println birds.max { it.size() }
		println birds.min { it.size() }
	}
}
