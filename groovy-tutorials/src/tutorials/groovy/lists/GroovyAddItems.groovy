package tutorials.groovy.lists

class GroovyAddItems {
	
	static main(args) {
		def cartoons = ['Regular Show', 'The Amazing World of Gumball']
		cartoons.push('Adventure Time')
		cartoons[3] = 'Batman'
		cartoons << 'Smurfs'
		println cartoons
		
		cartoons.plus(4, 'Scooby Doo')
		println cartoons
		
		def cartoonsWithPlus = cartoons.plus(2, 'Scooby Doo')
		println cartoonsWithPlus
		
		cartoons.add(0, 'Jhonny Test')
		println cartoons
		
		cartoons.addAll(2, ['Tom and Jerry', 'Uncle Grandpa'])
		println cartoons
	}
}
