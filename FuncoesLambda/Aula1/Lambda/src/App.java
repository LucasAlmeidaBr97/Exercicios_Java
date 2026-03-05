public class App {
    public static void main(String[] args) throws Exception {
        
        // Java 8: FUNÇÕES LAMBDA

        new Thread(new Runnable () {
            @Override
            public void run() {
                System.out.println("Olá mundo!");
            }
        }).run();

        
    }
}
