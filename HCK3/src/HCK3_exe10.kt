fun main() {
    // Escreva um programa em que o usuário informe 10 valores e escreva quantos desses valores lidos estão entre os números 24 e 42 (incluindo os valores 24 e 42) e quantos deles estão fora deste intervalo.

    var noIntervalo:Int = 0
    var foraIntervalo:Int = 0

    for (i in 1..10) {
        print("Digite o valor $i: ")
        val valor = readln().toInt()

        if (valor in 24..42) {
            noIntervalo++
        } else {
            foraIntervalo++
        }
    }

    println("\nValores entre 24 e 42: $noIntervalo")
    println("Valores fora do intervalo: $foraIntervalo")
}
