package tutorials.groovy.maps

class GroovyMapDeclaration {
    
    static main(args) {
        def emptyStudentMap = [:]
        println emptyStudentMap // [:]
        
        def studentMapWithInitialValue = [name: "John", surname: "Doe", age: 17]
        println studentMapWithInitialValue //[name: "John", surname: "Doe", age: 17]
    }
}