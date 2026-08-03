public class App {
    public static void main(String[] args) throws Exception {
        try {
            checkAge(14);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkAge(int age) throws Exception{
        if (age < 18) {
            throw new Exception("Idade inferior a permitida.");
        }
        System.out.println("Acesso permitido.");
    }
}
