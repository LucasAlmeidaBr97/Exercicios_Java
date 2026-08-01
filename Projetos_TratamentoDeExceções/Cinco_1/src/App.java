import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner scan = new Scanner(System.in)) {
            SaveNumber saveNumber = new SaveNumber();
            System.out.println("Digite um número: ");
            saveNumber.readNumer(scan);
            System.out.println(saveNumber.toString());
        } catch (Exception e) {
            System.out.println("ERRO: [" + e.getMessage() + "].");
        }
    }
}
