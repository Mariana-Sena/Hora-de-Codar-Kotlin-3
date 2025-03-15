fun main(){
    // Escreva um algoritmo para ler 2 valores informados pelo usuário e se o segundo valor informado for igual ou menor que ZERO, deve ser lido um novo valor. Ou seja, para o segundo valor não pode ser aceito o valor zero, nem um valor negativo.
    // O programa deve imprimir o resultado da divisão do primeiro valor lido pelo segundo valor e exibir o resultado ao usuário.

    print("Informe o primeiro valor: ")
    val v1 = readln().toDouble()

    print("Informe o segundo valor: ")
    var v2 = readln().toDouble()

    while (v2 <= 0) {
        print("Informe o segundo valor: ")
        v2 = readln().toDouble()
    }

    val div:Double = v1 /  v2
    print("\nO resultado da divisão é $div")

}