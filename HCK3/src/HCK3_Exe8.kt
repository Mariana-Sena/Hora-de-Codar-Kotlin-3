fun main(){
    //  Ler um valor N e imprimir todos os valores inteiros entre 1 (inclusive) e N (inclusive). Considere que o N será sempre maior que ZERO.

    print("Digite um valor maior que zero: ")
    val n = readln().toInt()

    if (n > 0) {
        for (i in 1..n) {
            print("$i ")
        }
    } else {
        println("Por favor, digite um valor maior que zero.")
    }
}