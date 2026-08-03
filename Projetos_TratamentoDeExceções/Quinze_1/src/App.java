public class App {
    public static void main(String[] args) throws Exception {
        
        try {
            sacar(1000, 1200);
        } catch (SaldoInsuficienteException e) {
            System.out.println("ERRO: [" + e.getMessage() + "].");
        }
    }

    public static void sacar(float saldo, float valor){
        if (valor > saldo) {
            throw new SaldoInsuficienteException("Valor do saque maior que o saldo atual!");
        }
    }
}
