import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercicio2 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "Lucas",
                "Ana",
                "Carlos",
                "Maria");

        List<String> capitalNames = names.stream()
            .map(name -> name.toUpperCase())
            .collect(Collectors.toList());

        capitalNames.forEach(name -> {System.out.println(name);});
    }
}
