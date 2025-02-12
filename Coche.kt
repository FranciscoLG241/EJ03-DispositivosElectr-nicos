class Coche: EncendidoApagado, Vehiculo{
    override var motorEncendido: Boolean = false
    override val kmHora: Int = 0


    override fun encender() {
        if (!motorEncendido){
            motorEncendido = true
            println("El motor está encendido")
        }
    }


    override fun apagar() {
        if (motorEncendido){
            motorEncendido = false
            println("El motor está apagado")
        }
    }


    override fun acelerar(velocidad: Int) {
        if (!motorEncendido){
            motorEncendido = true
            println("El coche está acelerando")
        }
    }


    override fun frenar(velocidad: Int) {
        if (motorEncendido){
            motorEncendido = false
            println("El coche está frenando")
        }
    }
}





