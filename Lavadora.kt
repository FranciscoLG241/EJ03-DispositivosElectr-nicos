class Lavadora: EncendidoApagado {

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
}