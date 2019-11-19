package tutorials.groovy.lists

class GroovyListApply {
	
	static main(args) {
		def self = new GroovyListApply()
		def cartoons = [
			'Regular Show',
			'The Amazing World of Gumball',
			'Adventure Time'
			]
			
		def cartoonsWithUpperCase = cartoons*.toUpperCase()
		println cartoonsWithUpperCase
		
		def cartoonStartsAToUppercare = cartoons.collect { cartoon -> self.uc(cartoon) }
		println cartoonStartsAToUppercare
	}
	
	def uc(String cartoon) {
		if (cartoon =~ /^A/ ) cartoon.toUpperCase()
		else cartoon
	}
}
