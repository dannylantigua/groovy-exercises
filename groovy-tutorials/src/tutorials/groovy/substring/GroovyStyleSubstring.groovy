package tutorials.groovy.substring

class GroovyStyleSubstring {
	
	static main(args) {
		def text1 = "My last character will be removed soon"
		println text1[0..-2]
		
		def text2 = "My first word will be removed soon";
		println text2[3..-1]
		
		def text3 = "noos em daer lliw uoy ,tneitap eB"
		println text3[-1..0]
	}
}
