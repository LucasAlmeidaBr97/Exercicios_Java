public class Ex6 {

public static void main(String[] args) {
    String name = null;
    try {
        System.out.println(name.toUpperCase());
    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        System.out.println("Continou");
    }
    
}    
}
