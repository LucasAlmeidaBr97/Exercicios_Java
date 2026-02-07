interface Taxi {
    void reservar();

}

class TexiImpl implements Taxi {

    @Override
    public void reservar() {
        System.out.println("Taxi reservado");
    }

}

public class App {
    public static void main(String[] args) throws Exception {
        Taxi taxi = new TexiImpl();
        taxi.reservar();
    }
}
