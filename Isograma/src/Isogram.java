import java.util.HashMap;
import java.util.Map;

public class Isogram {

    public static boolean isIsogram(String str) {
        str = str.toLowerCase();
        Map<Character, Integer> word = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (word.containsKey(c)){
                return false;
            }

            word.put(c, i);
        }

        return true;

    }
}
