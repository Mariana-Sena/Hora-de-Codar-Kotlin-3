fun main(){
    // Escreva um programa para imprimir todas as tabuadas de 1 a N. N será informado pelo usuário.

    print("Digite um valor: ")
    val n = readln().toInt()

    for (i in 1..n) {
        println("\nTabuada de $i:")
        for (j in 1..10) {
            println("$i x $j = ${i * j}")
        }
    }
}
