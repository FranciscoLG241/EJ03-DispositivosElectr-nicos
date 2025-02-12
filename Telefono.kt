class Telefono(val marca: String = "Desconocido" , val modelo: String = "Desconocido"): EncendidoApagado, DispositivoElectronico {
    private var encendido = false

    override fun apagar() {
        if (encendido){
            encendido = false
            println("El teléfono está apagado")
        }
    }


    override fun encender() {
        if (!encendido){
            encendido = true
            println("El teléfono está encendido")
        }
    }


    override fun reiniciar() {
        if (encendido){
            println("Reiniciando...")
            apagar()
            encender()
        }else{
            println("El teléfono está apagado. Enciéndelo primero")
        }
    }


    override fun toString(): String {
        return "El teléfono es de la marca: $marca y de modelo: $modelo"
    }
}