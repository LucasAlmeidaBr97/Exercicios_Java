package quatro;

import java.util.Scanner;

public class Calculator {
    private int number;
    private int number2;

    Scanner scan = new Scanner(System.in);

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public int divideByOneHundred() {
        return 100 / getNumber();
    }

}
