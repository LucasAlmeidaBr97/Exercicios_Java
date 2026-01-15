package view;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import model.User;
import model.enums.Role;
import model.enums.Status;

public class Menu {

    Scanner scan = new Scanner(System.in);

    public void showMenu() {
        int value = 0;
        System.out.println("###############################");
        System.out.println("Escolha uma opção");
        System.out.println("1. Cadastrar | 2. Login | 3. Sair");
        value = scan.nextInt();

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

    public void registerForm() {
        User newUser = new User();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Digite seu nome: ");
        newUser.setName(scan.next());
        System.out.println("Digite sua data de nascimento (dd/MM/yyyy): ");
        String birthDateInput = scan.next();
        newUser.setBirthDate(LocalDate.parse(birthDateInput, formatter));
        System.out.println("Digite seu email: ");
        newUser.setEmail(scan.next());
        System.out.println("Digite seu gênero: ");
        newUser.setGender(scan.next());
        newUser.setStatus(Status.ACTIVE);
        newUser.setRole(Role.CONSUMER);
        System.out.println(newUser);
    }

}
