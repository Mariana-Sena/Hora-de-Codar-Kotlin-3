fun main(){
    // Faça um algoritmo que calcule e escreva a média aritmética dos dois números inteiros informados pelo usuário e todos os números inteiros entre eles. Considere que o primeiro sempre será menor que o segundo.

    println("Digite o primeiro número (menor):")
    val num1 = readln().toInt()
    println("Digite o segundo número (maior):")
    val num2 = readln().toInt()

    var soma = 0
    var j = 0

    for (i in num1..num2) {
        soma += i
        j++
    }

    val media = soma.toDouble() / j
    println("A média aritmética dos números inteiros entre $num1 e $num2 é $media")
}