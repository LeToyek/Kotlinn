package Data

open class Shape(){
    open val corner : Int = 4
}
open class Rectangle : Shape(){
    override val corner : Int = 3
    open fun getArea(){
        val hasil : Int = corner*corner
        println(hasil)
    }
}
class Triangle : Rectangle(){
    override val corner: Int = 6
    val height : Int = 4
    override fun getArea() {
        val hasil : Int = height * corner /2
        println("Triangle's area = $hasil")
        super.getArea()
    }

}