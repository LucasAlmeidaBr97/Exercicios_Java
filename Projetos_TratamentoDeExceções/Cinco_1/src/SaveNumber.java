import java.util.Scanner;

public class SaveNumber implements ReadNumbers {

    private int n;

    @Override
    public void readNumer(Scanner scan) throws NumberFormatException {
        setN(Integer.parseInt(scan.nextLine()));
    }

    private int getN() {
        return n;
    }

    private void setN(int n) {
        this.n = n;
    }

    @Override
    public String toString() {
        return "Você digitou: " + getN();
    }

}
