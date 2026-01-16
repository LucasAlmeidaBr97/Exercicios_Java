package validation;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class inputValidation {

    public static Integer validadeIntEntry(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    public static String validateStringEntry(Scanner scan) {
        String input;
        while (true) {
            input = scan.nextLine();
            if (input != null && !input.trim().isEmpty() && input.matches("^[a-zA-ZÀ-ÿ\\s]+$")) {
                return input;
            } else {
                System.out.println("Erro: Entrada inválida! Digite apenas letras.");
                System.out.print("Tente novamente: ");
            }
        }

    }

    public static String validateEmailEntry(Scanner scan) {
        String input;
        while (true) {
            input = scan.nextLine();
            if (input != null && !input.trim().isEmpty()
                    && input.matches("^[\\w.-]+@[\\w.-]+\\.[a-z]{2,}$")) {
                    return input;
            } else {
                System.out.println("Erro: Formato de e-mail inválido (ex: usuario@email.com).");
                System.out.print("Tente novamente: ");
            }
        }

    }

    public static LocalDate validateDateEntry(Scanner scan) {
        String input;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        while (true) {
            input = scan.nextLine();
            try {
                LocalDate validDate = LocalDate.parse(input, formatter);
                if (validDate != null && validDate.isAfter(LocalDate.now())) {
                    System.out.println("Erro: A data não pode ser no futuro!");
                    System.out.print("Digite uma data de nascimento válida: ");
                } else {
                    return validDate;
                }
            } catch (DateTimeException e) {
                System.out.println("Erro: Formatado da Data inválido (ex: 02/02/2002)");
                System.out.print("Tente novamente: ");
            }
        }
    }

}
