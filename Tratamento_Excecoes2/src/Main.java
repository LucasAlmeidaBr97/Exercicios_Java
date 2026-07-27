public class Main {
   public static void main(String[] args) {
        try{
            System.out.println(new ReadNumber().ReadIntNumber("Digite um número"));   
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
   }
}
