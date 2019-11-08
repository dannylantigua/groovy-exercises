package tutorials.groovy.maps

/**
 * GroovyMapUnion.
 * Concatenate +2 maps into one.
 * 
 * @author USGDAL
 * @since 11/08/2019
 */
class GroovyMapUnion {
	
	static main(args) {
		def studentProp1 = [name: 'John', surname: 'Doe']
		def studentProp2 = [age: 17, class: '11C']
		def studentProp3 = [school: 'Groovy School']
		def student = studentProp1 + studentProp2 + studentProp3
		
		println student
	}
}
