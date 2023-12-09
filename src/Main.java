import userdata.User;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        User user = new User();
        user.setEmail("ilyas@gmail.com");
        user.setFullName("Ilyas Zhuanyshev");
        user.setBirthdate(LocalDate.of(1989, 5,26));

        User user2 = new User();
        user2.setEmail("shaima@gmail.com");
        user2.setFullName("Shaima Ibrahim");
        user2.setBirthdate(LocalDate.of(1995, 12,31));

        System.out.println(user2);

    }
}