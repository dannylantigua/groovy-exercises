package tutorials.groovy.lists

class GroovyLookupItems {
	
	static main(args) {
		def cartoons = [
				'Regular Show',
				'The Amazing World of Gumball',
				'Adventure Time',
				'Uncle Grandpa',
				'Batman',
				'Scooby Doo'
			]
			
		def scoobyDoo = cartoons.find { it == 'Scooby Doo' }
		println scoobyDoo
		
		def cartoonNamesWithSizeGreaterThan12  = cartoons.findAll { it.size() > 12 }
		println cartoonNamesWithSizeGreaterThan12
		
		def cartoonNamesWithSizeGreaterThan15  = cartoons.findAll { cartoon -> cartoon.size() > 15 }
		println cartoonNamesWithSizeGreaterThan15
		
		def cartoonsFoundWithRegex = cartoons.findAll { it =~ /an/ }
		println cartoonsFoundWithRegex
		
		def cartoonIndexList = cartoons.findIndexOf { it =~ /^A/ }
		println cartoonIndexList
		
		def cartoonIndexListWithStartPoint = cartoons.findIndexOf(4) { it =~ /^A/ }
		println cartoonIndexListWithStartPoint
		
		def cartoonLastIndex = cartoons.findLastIndexOf { it.size() > 10 }
		println cartoonIndexList
	}
}
