
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercicio1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 8, 15, 22, 9, 14, 30, 11);
            
        List<Integer> evenNumbers = numbers.stream()
            .filter(n -> n % 2 == 0)
            .collect(Collectors.toList());

            evenNumbers.forEach(number -> {System.out.println(number);});

    }
}
