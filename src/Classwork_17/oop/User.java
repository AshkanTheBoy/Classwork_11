package Classwork_17.oop;

public class User {
    protected String name;
    protected String surame;

    public User(String name, String surame) {
        this.name = name;
        this.surame = surame;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surame='" + surame + '\'' +
                '}';
    }
}
