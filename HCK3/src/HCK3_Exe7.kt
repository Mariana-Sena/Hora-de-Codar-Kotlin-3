fun main(){
    //  Escreva um algoritmo para ler as notas de avaliações de um aluno, calcule e imprima a média (simples) desse aluno. Só devem ser aceitos valores válidos durante a leitura (0 a 10) para cada nota. São 6 notas ao total.
    // Caso o valor informado para qualquer uma das notas esteja fora do limite estabelecido, deve ser solicitado um novo valor ao usuário.

    val notas = mutableListOf<Double>() //introduzindo o conceito de lista -> criação de uma lista vazia
    var soma = 0.0

    for (i in 1..6) {
        var nota: Double
        do {
            print("Digite a nota $i: ")
            nota = readln().toDouble()
            if (nota < 0 || nota > 10) {
                println("\nNota inválida. Digite um valor entre 0 e 10.\n")
            }
        } while (nota < 0 || nota > 10)

        notas.add(nota)
        soma += nota
    }

    val media = soma / notas.size
    // ao declarar a variável média, já se pega o valor armazenado a soma e divide pelo número de elementos referente ao tamanho da lista notas
    println("A média das notas é: $media")
}