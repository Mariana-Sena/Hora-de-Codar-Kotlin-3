fun main(){
    // Crie uma bomba relógio (usando somente código - para deixar claro!) cuja contagem regressiva vá de 30 a 0. No final da repetição escreva "EXPLOSÃO".

    for (i in 30 downTo 0) { // Criação de sequência de números decrescentes
        println(i)
        Thread.sleep(1000)  // Pausa de 1 segundo entre cada número
    }
    println("  | | | | |  ")
    println("--EXPLOSÃO--")
    println("  | | | | |  ")
}