interface Taxi {
    void reservar(String origem); //único método abstrato

   

}

public class App {
    public static void main(String[] args) throws Exception {

        Taxi taxi = (origem) -> { // () parametros do método; -> chaves corpo do método implementado{}
            System.out.println("Taxi reservado. Origem: " + origem);
        };
        taxi.reservar("Campinas");
    }
}
