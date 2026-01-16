package view;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import model.User;
import model.enums.Role;
import model.enums.Status;
import validation.inputValidation;

public class Menu {

    Scanner scan = new Scanner(System.in);
    int value = 0;

    public void showMenu() {//----Menu
        while (value != 3) {
            System.out.println("###############################");
            System.out.println("Escolha uma opção");
            System.out.println("1. Cadastrar | 2. Login | 3. Sair");
            String input = scan.nextLine();
            Integer result = inputValidation.validadeIntEntry(input);

            if (result != null) {
                value = result;    
            }

            switch (value) {
                case 1 -> {
                    System.out.println("Iniciando Cadastro... ");
                    registerForm();
                }
                case 2 -> System.out.println("Login...");
                case 3 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida!");
            }
        }

    }//----Menu

    public void registerForm() {
        System.out.println("Digite seu nome: ");
        String name = inputValidation.validateStringEntry(scan);
        System.out.println("Digite sua data de nascimento (dd/MM/yyyy): ");
        LocalDate birDate = inputValidation.validateDateEntry(scan);
        System.out.println("Digite seu email: ");
        String email = inputValidation.validateEmailEntry(scan);
        System.out.println("Digite seu gênero: ");
        String gender = inputValidation.validateStringEntry(scan);
        User newUser = new User(name, birDate, email, gender);
        System.out.println(newUser);
    }

}
