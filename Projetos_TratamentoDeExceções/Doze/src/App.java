import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {
        abrirArquivo();
    }

    public static void abrirArquivo(){
        try {
            FileReader arquivo = new FileReader("dados.txt");
            System.out.println("Arquivo aberto com sucesso!");
            arquivo.close();
        } catch (FileNotFoundException e) {
            System.out.println("Erro: O arquivo 'dados.txt' não foi encontrado.");
        } catch (IOException e) {
            System.out.println("Erro ao manipular o arquivo: " + e.getMessage());
        }

    }
}
