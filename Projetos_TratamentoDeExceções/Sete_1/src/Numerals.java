
public class Numerals implements Calculator {
    private float dividend;
    private float divider;

    public Numerals(float dividend, float divider) {
        setDividend(dividend);
        setDivider(divider);
    }

    @Override
    public float calculate() {
        if (getDividend() == 0 || getDivider() == 0) {
            throw new ArithmeticException("Tantativa de Realizar divisão com zero");
        }
        System.out.print("A divisão entre " + getDividend() + " e " + getDivider() + " é = ");
        return dividend / divider;
    }

    private float getDividend() {
        return dividend;
    }

    private float getDivider() {
        return divider;
    }

    private void setDividend(float dividend) {
        this.dividend = dividend;
    }

    private void setDivider(float divider) {
        this.divider = divider;
    }

}
