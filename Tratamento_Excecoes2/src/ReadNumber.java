import java.util.Scanner;

public class ReadNumber {

    Scanner scan = new Scanner(System.in);

    public int ReadIntNumber(String message) {
        System.out.println(message);
        if (!scan.hasNextInt()) {
            String incorrectEntry = scan.next();
            throw new InvalidEntry("Erro: Você digitou '" + incorrectEntry + "' em vez de um numero inteiro!");
        }
        return scan.nextInt();
    }

    

}
