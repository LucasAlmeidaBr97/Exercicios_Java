import java.util.List;
import java.util.Arrays;

public class Java8LambdaStream {

    public static void main(String[] args) {

        // JAVA 8: FUNÇÕES LAMBDA

        // API DE STREAM

        // stream - fluxo de dados

        //java 8 com Stream
        List<Integer> asList = Arrays.asList(1, 2, 3, 4);
        asList.stream()
                .filter(e -> e % 2 == 0)
                .forEach(e -> System.out.println(e));

        // Imprimir lista java 7
        for (Integer integer : asList) {
            System.out.println(integer);
        }

    }

}
