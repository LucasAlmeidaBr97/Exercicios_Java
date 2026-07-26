import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    static  Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n1 = 0; 
        int n2 = 0; 
        try {
            n1 = readNumber("Digite o primeiro numero");
            n2 = readNumber("Digite o segundo numero");    
        } catch (Exception e) {
            System.out.println("Entrada de numero invalida!");
            System.out.println(e.getMessage());
        }
        Calculator calculator = new Calculator(n1, n2);        
        try {
            System.out.println(calculator.toDivide());
        } catch (ArithmeticException e) {
            System.out.println("Tentativa de divisão por zero");
            e.printStackTrace();
        }
        
    }

    public static int readNumber(String message) {
        try {
            System.out.println(message);
            return scan.nextInt();
        } catch (InputMismatchException e) {
            throw new InputMismatchException("O texto digitado não é um numero inteiro valido");
        }
    }
}
