interface Taxi {
    void reservar();

}

public class App {
    public static void main(String[] args) throws Exception {

        Taxi taxi = () -> { // () parametros do método; -> chaves corpo do método implementado{}
            System.out.println("Reservar");
        };
        taxi.reservar();
    }
}
