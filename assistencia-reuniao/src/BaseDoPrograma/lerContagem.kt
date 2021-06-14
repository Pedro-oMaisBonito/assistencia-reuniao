import java.io.FileReader
import java.lang.Exception

// Está é a função "lerContagem". E como o próprio nome diz, essa função irá servir para ler a Contagem (Arquivo).

fun lerArquivo()
{
    try {
        val fin = FileReader("reuniao.txt")
        var c: Int?
        do {
            c = fin.read()
            print(c.toChar())
        } while (c != -1)
    } catch (ex: Exception) {
        print(ex.message)
    }
}

// Explicação para como ler um arquivo.
// Primeiro precisamos achar o arquivo. E para isso usamos a função "FileReader("nome.txt")"
// Depois criamos uma variavel para ler cada letra (no meu caso usei o nome c).
// Depois usamos usamos a função "do" para imprimir as letras do arquivo e só pare quando acabar os "c".
