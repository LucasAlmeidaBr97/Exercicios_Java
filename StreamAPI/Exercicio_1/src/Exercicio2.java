import java.util.ArrayList;
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

        //Exercício 8
        List<Double> notes = new ArrayList<>();

        notes.add(8.5);
        notes.addAll(Arrays.asList(7.0, 9.5, 6.0));
        System.out.println(average(notes));


        //Exercicio 9
        int [] numbers5 = new int[5];
        numbers5[0] = 4;
        numbers5[1] = 18;
        numbers5[2] = 3;
        numbers5[3] = 90;
        numbers5[4] = 12;

        System.out.println(bigger(numbers5));

        //Exercicio 10
        int [] numbers6 = {1,2,3,2,4,5,3,6};
        numbers6 = removeEquals(numbers6);
        for (int numbers62 : numbers6) {
            System.out.println(numbers62);
        }

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
                .collect(Collectors.toList())
;
    }

    // Exercício 7
    public static Optional<Integer> addAll (List<Integer> numbers) {
        return numbers.stream()
            .reduce((n1, n2) -> n1 + n2);
    }

    //Exercicio 8
    public static double average(List<Double> notes ) {
        return notes.stream()
            .mapToDouble(n -> n.doubleValue())
            .average()
            .orElse(0.0);
    }

    //Exercicio 9 
    public static int bigger (int[] numbers) {
        return Arrays.stream(numbers)
            .max()
            .orElse(0);
    }

    //Exercício 10
    public static int [] removeEquals(int [] numbers) {
        return Arrays.stream(numbers)
            .distinct()
            .toArray();
    }
}
