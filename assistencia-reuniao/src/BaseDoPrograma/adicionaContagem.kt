import java.io.FileWriter
import java.lang.Exception

// Essa é a função para adicionar novas contagens.

fun adicionaContagem(str: String)
{
    try {
        val fo = FileWriter("reuniao.txt", true)
        fo.write(str + "\n")
        fo.close()
    } catch (ex: Exception) {
        print(ex.message)
    }
}

// Para adicionar a contagem eu fiz da seguinte maneira ->
// Usei a função do Kotlin 'FileWriter' para ler um arquivo, e salvar :p
// Coloquei para escrever a string e pular uma linha (Só pra não ficar feio).
// Após isso fecha-se o arquivo txt.
// E caso não funcione ele lança uma exception padrão.
