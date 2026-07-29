import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        Calculator calculator = new Calculator();
        try {
            calculator.setN1(readNumber("Digite o primeiro numero: ", scan));
            calculator.setN2(readNumber("Digite o segundo numero: ", scan));
            System.out.println("Resultado: " + calculator.divide());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada inválida. Por favor, digite apenas números.");
        } finally {
            scan.close();
        }

    }

    public static float readNumber(String msg, Scanner scan) {
        System.out.println(msg);
        return scan.nextFloat();
    }
}