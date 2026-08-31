import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        try {
            int n = readNumber("Digite um número: ", scan);
            float result = toDivid(n);
            System.out.println("Numero: " + n + " dividido por 100 é igual a: "+ result);
        } catch (InputMismatchException e) {
            System.out.println("[ERRO]: Entrada invalida");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static int readNumber(String msg, Scanner scan) throws Exception{
        System.out.println(msg);
        int n = scan.nextInt();
        if (n == 0) {
            throw new ArithmeticException("[ERRO]: Tentativa de divisão por zero.");
        }
        return n;
    }

    public static float toDivid(int n) {
        return n/100;
    }
}
