import java.io.FileReader;

public class App {
    public static void main(String[] args) throws Exception {
        abrirArquivo();
    }

    public static void abrirArquivo() throws Exception {
        FileReader arquivo = new FileReader("dados.txt");
    }
}
