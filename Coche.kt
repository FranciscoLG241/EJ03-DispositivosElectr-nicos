class Coche(val marca: String = "Desconocido" , val modelo: String = "Desconocido"): EncendidoApagado, Vehiculo{
    override var motorEncendido: Boolean = false
    override var kmHora: Int = 0


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
            kmHora += velocidad
        }
    }


    override fun frenar(velocidad: Int) {
        if (motorEncendido){
            kmHora -= velocidad
            if (kmHora < 0){
                kmHora = 0
            }
        }
    }

    override fun toString(): String {
        return "El coche es de la marca: $marca y de modelo: $modelo"
    }


}





