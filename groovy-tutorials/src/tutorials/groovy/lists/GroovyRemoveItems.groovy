package tutorials.groovy.lists

class GroovyRemoveItems {
	
	static main(args) {
		def cartoons = ['Regular Show', 'The Amazing World of Gumball', 'Adventure Time']
		def poppedElement = cartoons.pop(); // This always remove the last element
		println poppedElement
		println cartoons
		
		cartoons.remove(0) // Remove by index
		println cartoons
	}
}
