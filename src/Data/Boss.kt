package Data

open class Boss(name : String) : Employee(name) {
    override fun sayHello(name : String){
        println("Bonjour $name, Je m'appele monsieur ${this.name}")
    }
}
//Boss class could be overrided by other class
//but u need to type open before the class
//class's default final but override open


class Janitor(name : String) : Boss(name){
    override fun sayHello(name: String) {
        println("Hole $name mi jefo ! Yo soy ${this.name}")
    }
}
