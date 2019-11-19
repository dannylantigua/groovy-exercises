package tutorials.groovy.substring

class GroovySubString {
	
	static main(args) {
		def log = "Exception on saving with username:johntheripper"
		def username = log.substring(log.lastIndexOf(":") + 1, log.length())
		println username
		
		def usernameWithoutEndIndex = log.substring(log.lastIndexOf(":") + 1)
		println usernameWithoutEndIndex
	}
}
