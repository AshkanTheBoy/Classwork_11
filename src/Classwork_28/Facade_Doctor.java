package Classwork_28;

import java.util.ArrayList;
import java.util.List;

public class Facade_Doctor {
    public static void main(String[] args) {
        Story.tellStory();
    }
}

class Frog{
    public Frog went(){
        System.out.println("went");
        return this;
    }

    public Frog sayHello(){
        System.out.println("Hello");
        return this;
    }

    public Frog introduce(){
        System.out.println("introduce");
        return this;
    }

    public Frog listen(){
        System.out.println("listen");
        return this;
    }
}

interface Animal{
    void come();
}

class Fox implements Animal{
    @Override
    public void come() {
        System.out.println("The fox came");
    }

    public void ask(){
        System.out.println("The fox has asked a question");
    }
}

class Dear implements Animal{
    @Override
    public void come() {
        System.out.println("The dear came");
    }
}

class Tortoise implements Animal{
    @Override
    public void come() {
        System.out.println("The tortoise came");
    }
}

class Story{
    private static List<Animal> animals = new ArrayList<>();
    public static void tellStory(){
        Frog frog = new Frog();
        Animal fox = new Fox();
        animals.add(new Dear());
        animals.add(new Tortoise());
        animals.add(fox);
        frog.went().sayHello();
        animals.forEach(Animal::come);
        frog.introduce();
        ((Fox)fox).ask();
        frog.listen();
    }
}
