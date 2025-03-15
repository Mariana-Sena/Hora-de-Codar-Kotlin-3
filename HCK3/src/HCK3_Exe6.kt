fun main(){
    // Escreva um programa para ler 2 notas de um aluno, calcular e imprimir a média final. Considere que a nota de aprovação é 9,5. Logo após escrever a mensagem "Calcular a média de outro aluno Sim/Não?" e solicitar uma resposta. Se a resposta for "S", o programa deve ser executado novamente, caso contrário deve ser encerrado exibindo a quantidade de alunos aprovados.

    var continuar:Boolean
    var aprovados = 0

    do {
        println("Digite a primeira nota:")
        val nota1 = readln().toDouble()
        
        println("Digite a segunda nota:")
        val nota2 = readln().toDouble()

        val media = (nota1 + nota2) / 2
        println("\nA média final é $media")

        if (media >= 9.5) {
            println("Aluno aprovado!")
            aprovados++
        } else {
            println("Aluno reprovado.")
        }

        println("Calcular a média de outro aluno? S/N?")
        val resposta = readln()

        continuar = resposta == "S"

    } while (continuar)

    println("Quantidade de alunos aprovados: $aprovados")
}