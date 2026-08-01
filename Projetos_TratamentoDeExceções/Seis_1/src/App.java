public class App {
    public static void main(String[] args) throws Exception {
        String nome = null;
        
        try {
            System.out.println(nome.toUpperCase());
        } catch (NullPointerException e) {
            System.out.println("ERRO: [" + e.getMessage() + "].");
        } finally {
            System.out.println("FIM.");
        }
    }
}
