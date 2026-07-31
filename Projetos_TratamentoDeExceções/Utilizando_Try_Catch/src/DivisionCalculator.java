public class DivisionCalculator implements Calculator {

    private int number1;
    private int number2;

    public DivisionCalculator(int number1, int number2) {
        setNumber1(number1);
        setNumber2(number2);
    }

    @Override
    public int calculate() {
        if (number2 == 0) {
            throw new ArithmeticException("ERRO: [Não é possível dividir por 0].");
        }
        return getNumber1() / getNumber2();
    }

    private int getNumber1() {
        return number1;
    }

    private void setNumber1(int number1) {
        this.number1 = number1;
    }

    private int getNumber2() {
        return number2;
    }

    private void setNumber2(int number2) {
        this.number2 = number2;
    }

    @Override
    public String toString() {
        return "DivisionCalculator [Number one = " + number1 + ", Number two = " + number2 + "]";
    }

}
