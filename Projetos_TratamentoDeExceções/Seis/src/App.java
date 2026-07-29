public class App {
    public static void main(String[] args) throws Exception {
        String name = null;
        try {
            System.out.println(name.toUpperCase());
        } catch (NullPointerException e ) {
            System.out.println("ERRO: ["+ e.getMessage() + "]");
        }
        
    }
}
