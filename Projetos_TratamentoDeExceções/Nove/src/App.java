import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner (System.in);
        try {
            int n = scan.nextInt();
        } catch (Exception e ) {
            System.out.println("ERRO: [" + e.getMessage() + "]");
        } finally {
            scan.close();
        }
        
    }
}
