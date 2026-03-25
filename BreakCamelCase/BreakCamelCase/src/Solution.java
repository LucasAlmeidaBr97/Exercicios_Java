public class Solution {
    public static void main(String[] args) throws Exception {
        camelCase("HelloWorld!");
    }

    public static String camelCase(String input) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isUpperCase(c) && i != 0) {
                sb.append(" ");
            } 

            sb.append(c);
        }
        System.out.println(sb);
        return sb.toString();
    }
}
