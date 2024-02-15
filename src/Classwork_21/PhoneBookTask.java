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
        ArrayList<BookPerson> book = new ArrayList<>();
        book.add(new BookPerson("John","Zhonn","+3(23)333-45-56"));
        book.add(new BookPerson("Zohn","Jhonn","+3(24)333-45-56"));
        book.add(new BookPerson("Andrew","Gork","+4(66)377-98-57"));
        book.add(new BookPerson("John","Borr","+8(77)222-23-88"));
        Comparator<BookPerson> compSurname = Comparator.comparing(person -> person.getSurname());
        for (BookPerson person: book){
            System.out.println(person.getSurname()+" "+person.getPhoneNumber());
        }
        System.out.println("After sorting: ");
        Collections.sort(book, compSurname);
        for (BookPerson person: book){
            if (person.getPhoneNumber().startsWith("3",1)){
                System.out.println(person.getSurname()+" "+person.getPhoneNumber());
            }
        }


    }
}

class BookPerson {
    private String name;
    private String surname;
    private String phoneNumber;

    public BookPerson(String name, String surname, String phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
    }

    public BookPerson(){}


    public String getSurname() {
        return surname;
    }


    public String getPhoneNumber() {
        return phoneNumber;
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