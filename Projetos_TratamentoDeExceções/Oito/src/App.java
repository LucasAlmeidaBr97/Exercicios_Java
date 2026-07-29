import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String[] names = { "Ana", "Carlos" };
        Scanner scan = new Scanner (System.in);
        try {
            int index = scan.nextInt();
            System.out.println(names[index]);
        } catch (InputMismatchException e) {
            System.out.println("ERRO: [Tipo de entrada inválida] - Digite um numero inteiro");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } finally {
            scan.close();
        }
    }
}
