import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        float n1, n2;
        try {
            n1 = numberReader(scan, "Digite o Divisor: "); 
            n2 =numberReader(scan, "Digite o Dividendo: ");   
            Numerals numerals = new Numerals(n1, n2);
            System.out.println(numerals.calculate());
        } catch (NumberFormatException e) {
            System.out.println("ERRO : [" + e.getMessage());       
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

    }

    public static float numberReader(Scanner scan, String msg) throws NumberFormatException {
        System.out.print(msg);
        float n = Float.parseFloat(scan.nextLine());
        return n;
    }


}
