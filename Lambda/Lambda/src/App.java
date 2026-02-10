interface Taxi {
    void reservar(); //único método abstrato

    default void outroMetodo() {
        System.out.println("Outro método"); //Método default com implementação
    } 

}

public class App {
    public static void main(String[] args) throws Exception {

        Taxi taxi = () -> { // () parametros do método; -> chaves corpo do método implementado{}
            System.out.println("Reservar");
        };
        taxi.reservar();
    }
}
