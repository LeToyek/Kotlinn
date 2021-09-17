package Main

import Data.Shape
import Data.Rectangle
import Data.Triangle

fun main(){
    val kotak = Shape()
    val persegi = Rectangle()
    val segitiga = Triangle()

    println(kotak.corner)
    persegi.getArea()
    segitiga.getArea()
}