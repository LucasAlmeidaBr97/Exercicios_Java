@FunctionalInterface
interface Taxi {
    double reservar(String origem, String destino); //único método abstrato
}

public class App {
    public static void main(String[] args) throws Exception {

        Taxi taxi = (origem, destino) -> { // () parametros do método; -> chaves corpo do método implementado{}
            System.out.println("Taxi reservado. Origem: " + origem + " => Destino: " + destino);
            return 80.60;
        };
        double valorReserva = taxi.reservar("Campinas", "São Paulo");
        System.out.println("Valor da reserva: " + valorReserva);
    }
}
