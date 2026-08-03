import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner (System.in);
        try {
            System.out.println("Digite um número inteiro: ");
            int number = scan.nextInt();    
        } catch(Exception e) {
            System.out.println("ERRO: [Entrada inválida]");
        } finally {
            scan.close();
        }
    }
}
