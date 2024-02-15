package Classwork_21;
/*
2. Имеется телефонная книга со списком номеров.
Вывести в отсортированном по фамилии порядку номера, начинающиеся на определенную цифру.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PhoneBookTask {
    public static void main(String[] args) {
        ArrayList<Person> book = new ArrayList<>();
        book.add(new Person("John","Zhonn","+3(23)333-45-56"));
        book.add(new Person("Andrew","Gork","+4(66)377-98-57"));
        book.add(new Person("John","Borr","+8(77)222-23-88"));
        Comparator<Person> compSurname = Comparator.comparing(person -> person.getSurname());
        for (Person person: book){
            System.out.println(person.getSurname()+" "+person.getPhoneNumber());
        }
        System.out.println("After sorting: ");
        Collections.sort(book, compSurname);
        for (Person person: book){
            System.out.println(person.getSurname()+" "+person.getPhoneNumber());
        }


    }
}

class Person{
    private String name;
    private String surname;
    private String phoneNumber;

    public Person(String name, String surname, String phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
    }

    public Person(){}


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}