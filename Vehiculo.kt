interface Vehiculo {
    var motorEncendido: Boolean
    val kmHora: Int


    fun acelerar(velocidad: Int)
    fun frenar(velocidad: Int)
}