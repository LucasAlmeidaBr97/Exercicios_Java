public class Calculator {
    
    private float n1;
    private float n2;

    public float divide (){
        if (n1 == 0 || n2 == 0) {
            throw new ArithmeticException("ERRO: [Não é possivel realizar divisões por zero]");
        }
        return n1 / n2;
    }

    public float getN1() {
        return n1;
    }

    public void setN1(float n1) {
        this.n1 = n1;
    }

    public float getN2() {
        return n2;
    }

    public void setN2(float n2) {
        this.n2 = n2;
    }
}
