class Lavadora(val marca: String = "Desconocido" , val modelo: String = "Desconocido"): EncendidoApagado {

    private var encendido = false


    override fun encender() {
        if (!encendido){
            encendido = true
            println("La lavadora está encendida")
        }
    }


    override fun apagar() {
        if (encendido){
            encendido = false
            println("La lavadora está apagada")
        }
    }


    override fun toString(): String {
        return "La lavadora es de la marca: $marca y de modelo: $modelo"
    }
}