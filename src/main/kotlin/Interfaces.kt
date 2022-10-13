/*
Course: DGL 204 - Programming for mobile app development
Author: Ashley Blacquiere

Week 3 content, including interfaces
*/
//week3

abstract class ServiceStation(
    val priceOfGasPerLitre: Double = 2.3,
    val tankVolume: Double = 45.2
)

interface Pumpable {
    fun pumpGas(fundsProvided: Double, paymentInCredit: Boolean)
}

interface Payable {
    fun acceptPayment(fundsProvided: Double)
    fun paymentMethod(isCredit: Boolean)
}

interface Fillable {
    fun fillTank(station: ServiceStation)
}

interface Driveable {
    val topSpeed: Int
    fun accelerate()
    fun brake()

}

class ShellStation(
    val name: String = "Shell Station"
) : ServiceStation(), Pumpable, Payable {
    override fun pumpGas(fundsProvided: Double, paymentInCredit: Boolean) {
        val litersOfGas = fundsProvided / priceOfGasPerLitre
        println("Filling the tank to $litersOfGas litres")
    }

    // acceptPayment method's prints the payment of the gas filled.
    override fun acceptPayment(fundsProvided: Double) {

        println("Please accept the payment of $fundsProvided dollars.")

    }

    // This method checks if the payment is done using credit or not.
    override fun paymentMethod(isCredit: Boolean) {

        if (isCredit) {
            println("Payment using Credit")
        } else
            println("Payment without Credit.")

    }

}

open class Vehicle(
    val cashAvailable: Double = 10.0,
    val paymentInCredit: Boolean = true

) {
    fun fillTank(station: ShellStation) {
        station.pumpGas(cashAvailable, paymentInCredit)
    }
}

class Car(

) : Vehicle(), Fillable, Driveable {
    override fun fillTank(station: ServiceStation) {

        println("Volume or the capacity of your gas tank is ${station.tankVolume}")

    }

    override val topSpeed: Int
        get() = TODO("Not yet implemented")


    override fun accelerate() {
        println("Accelerate")
    }

    override fun brake() {
        println("brake")
    }

}


fun main() {

    val s = ShellStation()
    val c = Car()

    c.fillTank(s)

}