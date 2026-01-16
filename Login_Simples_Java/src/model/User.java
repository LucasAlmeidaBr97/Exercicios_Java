package model;

import java.time.LocalDate;
import model.enums.Role;
import model.enums.Status;

public class User {
    private String name;
    private LocalDate birthDate;
    private String email;
    private String gender;
    private Status status;
    private Role role;

    public User() {

    }

    public User(String name, LocalDate birthDate, String email, String gender) {
        this.name = name;
        this.birthDate = birthDate;
        this.email = email;
        this.gender = gender;
        this.status = status.ACTIVE;
        this.role = role.CONSUMER;
    }

    public String getName() {
        return name;
    }

    public LocalDate birthDate() {
        return birthDate;

    }

    public String getEmail() {
        return email;
    }

    public String gerGender() {
        return gender;
    }

    public Status getStatus() {
        return status;
    }

    public Role gerRole() {
        return role;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User Name = " + name + ", Data de Nascimento = " + birthDate + ", Email = " + email + ", Genêro =" + gender
                + ", status =" + status + ", role=" + role + "";
    }

}
