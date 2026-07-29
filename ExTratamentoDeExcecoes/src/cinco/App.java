package cinco;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        readIntNumber(scan);
    }

    public static void readIntNumber(Scanner scan) {
        System.out.println("Digite um numero inteiro: ");
        try {
            System.out.println("Numero digitado: " + scan.nextInt());
        } catch (InputMismatchException e) {
            System.out.println("Erro: [Entrada invalida!]. Digite somente um numero inteiro.");
        }
    }
}