package Classwork_17.oop;

import java.util.LinkedList;
import java.util.List;

public class Users {
    public static void main(String[] args) {
        User user = new User("123","456");
        User guest = new Guest("222","444");
        User admin = new Admin("Admin","TheLord");

        List<User> users = new LinkedList<>();
        users.add(user);
        users.add(guest);
        users.add(admin);

        users.forEach(System.out::println);
    }
}

class Admin extends User{
    public Admin(String name, String surame) {
        super(name, surame);
    }

    @Override
    public String toString() {
        return "Admin{" +
                "name='" + name + '\'' +
                ", surame='" + surame + '\'' +
                '}';
    }
}

