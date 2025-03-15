fun main(){
    // Faça um algoritmo que calcule e escreva a média aritmética dos números inteiros entre 15 (inclusive) e 100 (inclusive).
    
    val i = 15
    val j = 100
    var sum = 0
    var count = 0

    for (x in i..j) {
        sum += x
        count++
    }

    val avg = sum.toDouble() / count
    println("A média aritmética dos números inteiros entre $i e $j é $avg")
}