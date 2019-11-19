package tutorials.groovy.lists

class GroovyListCount {
	
	static main(args) {
		def cartoons = [
			'Regular Show',
			'The Amazing World of Gumball',
			'Adventure Time',
			'Regular Show',
			'Adventure Time',
			'Adventure Time'
			]
			
		def cartoonsCount = cartoons.size()
		println cartoonsCount
		
		def advTimeCount = cartoons.count('Adventure Time')
		println advTimeCount
		
		def regShowCount = cartoons.count('Regular Show')
		println regShowCount
	}
}
