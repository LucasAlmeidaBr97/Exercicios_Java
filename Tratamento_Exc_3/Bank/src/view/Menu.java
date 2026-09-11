package view;

import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

import model.Account;

public class Menu {

    Scanner scan = new Scanner(System.in);
    public Account account = new Account();
    private boolean runing;

    public void start() {
        try {
            navigate(
                    this::mainMenu, Map.of(
                            1, this::depositFlow,
                            2, this::withDrawFlow,
                            3, () -> account.getBalance(),
                            4, this::stop));
        } catch (NumberFormatException e) {
            System.out.println("[ERRO]: Entrada Invalida!");
        }

    }

    public void stop() {
        setRuning(false);
    }

    public void mainMenu() {
        System.out.println("1.Depositar\r\n" +
                "2.Sacar\r\n" +
                "3.Consultar saldo\r\n" +
                "4.Sair");

    }

    public void inputValuesMenu(String msg) {
        System.out.println(msg);
    }

    public double readNumber(Scanner scan) throws NumberFormatException {
        System.out.println("Digite o valor: ");
        double v = Double.parseDouble(scan.nextLine());
        return v;
    }

    public void navigate(Runnable showMenu, Map<Integer, Runnable> actions) {
        setRuning(true);
        while (isRuning()) {
            showMenu.run();
            try {
                int op = scan.nextInt();
                scan.nextLine();
                Runnable action = actions.get(op);

                if (action == null) {
                    System.out.println("Opção Invalida");
                    continue;
                }

                action.run();
            } catch (InputMismatchException e) {
                System.out.println("[ERRO]: Entrada invalida!");
                scan.nextLine();
            }

        }

    }

    public void depositFlow() {
        try {
            account.deposit(readNumber(scan));
        } catch (NumberFormatException e) {
            System.out.println("[ERRO]: Entrada não númerica. Impossível realizar operação");
            start();
        }
        
    }

    public void withDrawFlow() {
        account.withDraw(readNumber(scan));
    }

    public boolean isRuning() {
        return runing;
    }

    public void setRuning(boolean runing) {
        this.runing = runing;
    }
}
