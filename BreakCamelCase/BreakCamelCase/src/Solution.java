public class Solution {
    public static void main(String[] args) throws Exception {
        camelCase("Hello, World!");
    }

    public static String camelCase(String input){
        for(int i = 0; i < input.length(); i++){
            char c = input.charAt(i);
            if (Character.isUpperCase(c)) {
                System.out.println("Maisculas: " + c);
            } 
        }
        return null;
    }
}
