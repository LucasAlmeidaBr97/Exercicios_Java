import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Digite o divior de 100: ");
            int n2 = scan.nextInt();

            int n1 = 100;
            
            DivisionCalculator calculator = new DivisionCalculator(n1, n2);
            System.out.println("Resultado: " + n1 + " / " + n2 + " = " + calculator.calculate());
        } catch (InputMismatchException e) {
            System.out.println("ERRO: Entrada inválida.");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

    }
}
