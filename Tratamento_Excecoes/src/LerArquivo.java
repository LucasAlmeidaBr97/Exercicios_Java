import java.io.FileNotFoundException;

public class LerArquivo {
    public static void main(String[] args) {
        try {
            lerArquivo(); 
        } catch (FileNotFoundException e) {
            System.out.println("O arquivo não foi encontrado. erro: " + e.getMessage());
        }
           
    }

    public static void lerArquivo() throws FileNotFoundException {
        System.out.println("arquivo.txt");
    }
}
