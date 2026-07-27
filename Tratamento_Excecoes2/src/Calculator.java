public class Calculator {
    

    public int number;

    public int divideBy100 () {
        if (getNumber() == 0){
            throw new ArithmeticException("Não é possível dividir zero");
        }
        return 100/this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber(){
        return number;
    }
}
