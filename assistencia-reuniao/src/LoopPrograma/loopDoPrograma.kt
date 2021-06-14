// Essa é a função para fazer o programa dar um loop.
// Criei um variavel chama da 'fim', com o valor 0. O programa ficará em loop até o valor mudar.
// Por isso no final de cada operação (a não ser fechar o programa), eu pergunto se o usuário quer fechar ou não o progeama.

fun loopDoPrograma() {
    var fim = 0
    while (fim == 0) {
        base()
        fim = readLine()!!.toInt()
    }
    if (fim == 1){
        println("Obrigado por usar, até a próxima!")
    }
}
