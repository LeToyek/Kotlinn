package Main

import Data.Boss
import Data.Employee
import Data.Manager
import Data.vicePresident
import Data.Janitor

fun main(){
    val joko = Employee("Joko")
    val darsono = Manager("Darsono")
    val jatmiko = vicePresident("Jatmiko")
    val hartono = Boss("Hartono")
    val eko = Janitor("Eko")

    joko.sayHello("santoso")
    hartono.sayHello("dodik")
    eko.sayHello("Hartono")
}