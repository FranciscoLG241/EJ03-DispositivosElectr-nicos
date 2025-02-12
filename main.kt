

fun main(){


    val telefono1 = Telefono("Xiami", "Redmi Note")
    val lavadora1 = Lavadora("NoMeSeMarcasDeLavadoras", "89S")
    val coche1 = Coche("Ford", "Focus")

    println("\n******************")

    println(telefono1)
    println(lavadora1)
    println(coche1)

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

