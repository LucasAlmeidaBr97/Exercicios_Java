interface Taxi {
    void reservar(); //único método abstrato
    void outroMetodo(); // outro abstrato gerá erro!

}

public class App {
    public static void main(String[] args) throws Exception {

        Taxi taxi = () -> { // () parametros do método; -> chaves corpo do método implementado{}
            System.out.println("Reservar");
        };
        taxi.reservar();
    }
}
