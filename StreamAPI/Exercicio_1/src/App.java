import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
        List<Integer> numeros = Arrays.asList(3, 8, 15, 22, 9, 14, 30, 11);
        List<Integer> numerosPares = numeros.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
                
                

                numerosPares.add(6);
                numerosPares.remove(2);
                
                System.out.println(numerosPares);
    }
    
}
