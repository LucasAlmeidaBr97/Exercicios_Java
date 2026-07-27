class CalculatorEx7 {
    private int n1;
    private int n2;
    private ReadNumber readNumer = new ReadNumber();

    public void setNumbers() {
        n1 = readNumer.ReadIntNumber("Digite o primeiro número: ");
        n2 = new ReadNumber().ReadIntNumber("Digite o segundo número");
    }

    public int divide() {
        if (n2 == 0) {
            throw new ArithmeticException("Não é possivel realizar divisão por zero.");
        }
        return n1 / n2;
    }

}
