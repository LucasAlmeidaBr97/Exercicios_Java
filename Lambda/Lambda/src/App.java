interface Taxi {
    void reservar();

}



public class App {
    public static void main(String[] args) throws Exception {
        
        Taxi taxi = new Taxi() {

            @Override
            public void reservar() {
                System.out.println("Reservar");    
            }
            
        };
        taxi.reservar();
    }
}
