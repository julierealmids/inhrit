import java.io.StringReader

fun main(){
    var motor=Car("toyota","LC","black",12)
    println(motor.capacity)
    println(motor.model)
    println(motor.make)
    println(motor.color)
    motor.carry(8)
    motor.identity()
    println( motor.calculateParkingFees(4))
    var bigcar=Bus("Isuzu","BC","Blue",80)
    println(bigcar.model)
    println(bigcar.make)
    println(bigcar.color)
    println(bigcar.capacity)
    println( bigcar.maxTripFare(100.0))
    println( bigcar.calculateParkingFees(2))
}
open class Car(var make:String,var model:String,var color:String,var capacity:Int){
    fun carry(people:Int){
        var x =people-capacity
        if (people<=capacity){
            println("carrying $people passengers")
        }
        else{
            println("over capacity by $x people")
        }
    }
    fun identity(){
        println("I am a $color $make $model")
    }
    open fun calculateParkingFees(hours:Int):Int{
        var y =  hours * 20
        return y

    }
}
class Bus( make:String, model:String, color:String,capacity:Int):Car(make,model,color,capacity){

    fun maxTripFare(fare:Double):Double{
        var x = fare*capacity
        return x

    }

    override fun calculateParkingFees(hours: Int): Int {
//        return super.calculateParkingFees(hours)
        var met=hours*capacity
        return met
    }

}