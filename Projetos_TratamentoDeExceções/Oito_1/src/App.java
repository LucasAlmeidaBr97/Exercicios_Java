import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String[] names = {"Ana", "Carlos"};

        Scanner scan = new Scanner (System.in);
        
        try {
            System.out.println("Digite um número");
            int index = scan.nextInt();
            System.out.println(names[index]);    
        } catch (InputMismatchException e) {
            System.out.println("ERRO: [Valor invalido]");
        } catch (IndexOutOfBoundsException e)  {
            System.out.println("ERRO :[" + e.getMessage() + "]. Não existe dado salvo no indice inserido.");
        }
    }
}
