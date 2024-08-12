package Acuario.Acuario

//fun construirAcuario() {

//    println("____________________________")
//    val miAcuario = Acuario(ancho = 25, largo = 25, alto = 40)
//    miAcuario.imprimirTamano()
//    val miTorre = TanqueTorre(diametro = 25, alto = 40)
//    miTorre.imprimirTamano()
// }
fun crearPeces() {
    val tiburon = Tiburon()
    val pezPayaso = PezPayaso()

    println("El color del Tiburón es: ${tiburon.color}")
    println("El color del Pez Payaso es: ${pezPayaso.color}")
}


fun main() {
    crearPeces()
}