public class App {
    public static void main(String[] args) throws Exception {
        Calculator calculator = new Calculator();
        calculator.setNumber(10);

        try {
            System.out.println(calculator.divideBy100());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
