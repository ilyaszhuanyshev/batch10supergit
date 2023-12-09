package userdata;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class User {

    private String email;
    private String fullName;
    private LocalDate birthdate;

    public User(){

    }

    public User(String email, String fullName, LocalDate birthdate) {
        this.email = email;
        this.fullName = fullName;
        this.birthdate = birthdate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    @Override
    public String toString() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd MMMM, yyyy");
        return "User{" +
                "email='" + email + '\'' +
                ", fullName='" + fullName + '\'' +
                ", birthdate=" + dateTimeFormatter.format(birthdate) +
                '}';
    }
}
