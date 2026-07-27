

public class Ex7 {
    
    public static void main(String[] args) {
        CalculatorEx7 calculatorEx7 = new CalculatorEx7();
        
        try {
            calculatorEx7.setNumbers();
            int resultado = calculatorEx7.divide();
            System.out.println("Resultado da divisão: " + resultado);
        } catch (InvalidEntry e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        
    }
}
