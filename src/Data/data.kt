package Data

open class Employee(val name : String){
    open fun sayHello(name : String){
        println("Hello $name, My name is ${this.name}")
    }
}
class Manager(name : String) : Employee(name){

}
class vicePresident(name: String) : Employee(name){

}