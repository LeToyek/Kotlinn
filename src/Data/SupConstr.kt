package Data

open class Customer (val name : String,val type : String,var Ballance : Int){
    constructor(paramName: String,paramBallance:Int):this(paramName,"ordinary",paramBallance){
    }
    constructor(paramName: String):this(paramName,100){

    }

}
class SuperCostumer: Customer{
    constructor(name: String):super(name,10000){
    }
    constructor(name:String, type: String,ballance : Int):super(name,type,ballance){

    }
}