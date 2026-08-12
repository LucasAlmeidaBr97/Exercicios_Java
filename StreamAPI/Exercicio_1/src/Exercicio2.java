import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
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

        capitalNames.forEach(name -> {
            System.out.println(name);
        });

        List<Integer> values = doubValue(Arrays.asList(2, 4, 6, 8));
        System.out.println(capitalNames);

        System.out.println(countElements(Arrays.asList("João",
                "Pedro",
                "Lucas",
                "Maria",
                "José")));

        List<Integer> numbers2 = sortNumbers(Arrays.asList(10, 3, 7, 2, 40, 15));
        System.out.println(numbers2);
        System.out.println(numbers2 = descendingOrder(numbers2));
        System.out.println(filterNames(Arrays.asList(
                "Lucas",
                "Amanda",
                "José",
                "Fernanda",
                "Ana")));
                
        //Exercício 7
        System.out.println(addAll(Arrays.asList(5,10,15,20)).get());

    }

    // Exercicio 3
    public static List<Integer> doubValue(List<Integer> numbers) {
        return numbers.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());

    }

    // Exercicio 4
    public static Integer countElements(List<String> names) {
        return (int) names.stream()
                .count();
    }

    // Exercicio 5
    public static List<Integer> sortNumbers(List<Integer> number) {
        return number.stream()
                .sorted()
                .collect(Collectors.toList());
    }

    public static List<Integer> descendingOrder(List<Integer> number) {
        return number.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }

    // Exercício 6
    public static List<String> filterNames(List<String> names) {
        return names.stream()
                .filter(name -> name.length() > 5)
                .collect(Collectors.toList());
    }

    // Exercício 7
    public static Optional<Integer> addAll (List<Integer> numbers) {
        return numbers.stream()
            .reduce((n1, n2) -> n1 + n2);
    }

}
