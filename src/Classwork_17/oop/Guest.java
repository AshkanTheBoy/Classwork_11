package Classwork_17.oop;

public class Guest extends User {

    public Guest(String name, String surame) {
        super(name, surame);
    }

    @Override
    public String toString() {
        return "Guest{" +
                "name='" + name + '\'' +
                ", surame='" + surame + '\'' +
                '}';
    }
}
