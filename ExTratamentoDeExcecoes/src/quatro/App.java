package quatro;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Digite o numero inteiro que será dividido por 100");
            calculator.setNumber(Integer.parseInt(scan.nextLine()));
            try {
                System.out.println(calculator.divideByOneHundred());
            } catch (ArithmeticException e) {
                System.out.println("[ERRO: [" + e.getMessage() + "]]. Tentativa de divisão por zero!");
            }
        } catch (NumberFormatException e) {
            System.out.println("[ERRO: [" + e.getMessage() + "]]. Digite somente um numero inteiro!");
        }
    }
}