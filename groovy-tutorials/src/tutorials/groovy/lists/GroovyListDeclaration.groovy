package tutorials.groovy.lists

class GroovyListDeclaration {
	
	static main(args) {
		def cartoons = []
		cartoons[0] = 'Regular Show'
		cartoons[1] = 'Adventure Time'
		println cartoons
		
		def cartoonsWithInitialItems = ['The Amazing World of Gumball', 'Johnny Bravo']
		println cartoonsWithInitialItems
		
		def cartoonsWithDefault = ['Johnny Test', 'Batman', 'Scooby Doo'].withDefault {'Smurfs'}
		println cartoonsWithDefault[1]
		println cartoonsWithDefault[4]
	}
}
