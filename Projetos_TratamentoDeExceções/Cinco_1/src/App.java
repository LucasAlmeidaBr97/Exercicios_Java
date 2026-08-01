import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Digite um numero: ");
            int n = Integer.parseInt(scan.nextLine());
            System.out.println("Voce digitou: " + n );
        } catch (NumberFormatException e) {
            System.out.println("ERRO: [" + e.getMessage() + "]. Digite um número inteiro.");
        }

    }
}
