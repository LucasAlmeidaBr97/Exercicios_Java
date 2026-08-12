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

        List<Integer> values = doubValue(Arrays.asList(2,4,6,8));
        System.out.println(capitalNames);

        System.out.println(countElements(Arrays.asList("João",
            "Pedro",
            "Lucas",
            "Maria",
            "José"
        )));
    }


    //Exercicio 3
    public static List<Integer> doubValue (List<Integer> numbers) {
        return numbers.stream()
            .map(n -> n * 2)
            .collect(Collectors.toList());
        
    }

    //Exercicio 4
    public static Integer countElements (List<String> names){
        return (int) names.stream()
        .count();
    }

}
