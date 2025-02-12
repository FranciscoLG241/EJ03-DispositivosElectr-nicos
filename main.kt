

fun main(){

    println("\n******************")

    val telefono = Telefono()
    telefono.encender()
    telefono.reiniciar()
    telefono.apagar()

    println("\n******************")

    val lavadora = Lavadora()
    lavadora.encender()
    lavadora.apagar()

    println("\n******************")

    val coche = Coche()
    coche.encender()
    coche.acelerar(50)
    coche.frenar(20)
    coche.frenar(40)
    coche.apagar()
    }

