package seis;

public class App {
    public static void main(String[] args) {
        String name = null;
        try {
            System.out.println(name.toUpperCase());
        } catch (NullPointerException e) {
            System.out.println("Erro: [" + e.getMessage()+"].");
        } finally {
            System.out.println("Inicie 'name' antes de chamar o método 'toUpperCase'.");
        }
    }
}
