package model;

import exceptions.SaldoInsuficienteException;

public class Account {
    private double balance;

    public boolean balanceVerify(double value) throws SaldoInsuficienteException {
        if (value > balance) {
            throw new SaldoInsuficienteException("[ERRO]: Saldo insuficiente");
        }
        return true;
    }

    public void withDraw(double value) {
        try {
            if (balanceVerify(value)) {
                balance = balance - value;
                System.out.println("Sacando: " + value + ", da sua conta.");
            }
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }
    }

    public void deposit(double value) {
        System.out.println("Depositando: " + value + ", na sua conta.");
        balance = balance + value;
    }

    public void getBalance() {
        System.out.println("O salda atual da sua conta é: " + balance);
    }

}
