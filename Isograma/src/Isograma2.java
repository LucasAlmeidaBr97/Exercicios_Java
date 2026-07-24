
public class Isograma2 {

    public static void main(String[] args) {
        System.out.println(isIsogram("rafael"));
    }

    public static boolean isIsogram(String str) {
        str = str.toLowerCase();
        char[] caracteres = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            caracteres[i] = c;
        }
        for (int i = 0; i < caracteres.length; i++) {
            char actualC = str.charAt(i);
            for (int j = i + 1; j < caracteres.length; j++) {
                if (actualC == caracteres[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
