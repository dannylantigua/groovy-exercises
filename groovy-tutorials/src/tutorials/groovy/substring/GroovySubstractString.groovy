package tutorials.groovy.substring

class GroovySubstractString {
	
	static main(args) {
		def text1 = "Sorry, I need to separate from you"
		println text1 - " you"
		
		def text2 = "Minus string usage"
		println text2.minus("usage")
	}
}
