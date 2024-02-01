package Classwork_17.oop;

public class Animals {
    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.sound();

        Animal[] animals = new Animal[3];
        animals[0] = new Cat();
        animals[1] = new Dog();
        animals[2] = new Mouse();
        for (Animal animal: animals){
            animal.sound();
        }

    }

}

abstract class Animal{
    public abstract void sound();
}

class Cat extends Animal{

    @Override
    public void sound() {
        System.out.println("Meow");
    }
}

class Dog extends Animal{

    @Override
    public void sound() {
        System.out.println("Bark");
    }
}

class Mouse extends Animal{

    @Override
    public void sound() {
        System.out.println("Peep");
    }
}
