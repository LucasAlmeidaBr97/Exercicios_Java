public class Calculator {

    int n1;
    int n2;

    public Calculator(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public int toDivide()throws ArithmeticException {
        int r = 0;
        r = n1 / n2;
        return r;
    }

}
