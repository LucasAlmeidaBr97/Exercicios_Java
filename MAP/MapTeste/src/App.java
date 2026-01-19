import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {

        Map<String, Integer> map = new HashMap<>();

        map.put("Lucas", 28);
        map.put("Amanda", 27);

        System.out.println(map.containsKey("Carlos"));

        

        for (Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " tem " + entry.getValue() + " anos");
        }

    }
}
