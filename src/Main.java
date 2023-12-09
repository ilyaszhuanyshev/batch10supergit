import userdata.User;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        User user = new User();
        user.setEmail("ilyas@gmail.com");
        user.setFullName("Ilyas Zhuanyshev");
        user.setBirthdate(LocalDate.of(1989, 5,26));

        System.out.println(user);

    }
}