// Essa é a função "base". Escolhi esse nome pois seria a base para o programa (escrever ou ler o arquivo).
// Nesta função estou pedindo qual operação o usuário irá usar. Podendo ser escrever ou ler a contagem.
fun base()
{
    println(
        "Olá tudo bem? Digite:\n" +
                "1- Para escrever a contagem de hoje.\n" +
                "2- Para ler a contagem.\n"
    )

    val op = readLine()!!.toInt()
    when (op) {
        1 -> {
            println("Ok, você escolheu escrever a contagem.")
            print("Escreva o dia e após isso o valor da contagem. Exemplo: '10/6/2021 -> 47' \n")
            var str: String = readLine().toString()
            adicionaContagem(str)
            println("Deseja continuar? Para continuar digite 0 ")
            println("Caso queria fechar o programa, digite 1.")
        }
        2 -> {
            lerArquivo()
            println("Deseja continuar? Para continuar digite 0 ")
            println("Caso queria fechar o programa, digite 1.")
        }
    }
}



