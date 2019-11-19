package tutorials.groovy.substring

class GroovyGetAt {
	
	static main(args) {
		def text1 = "crazy fox jumps over lazy dog"
		println text1.getAt(text1.length() - 5)
		
		def text2 = "keep calm and carry on"
		println text2.getAt(-1..5)
	}
}
