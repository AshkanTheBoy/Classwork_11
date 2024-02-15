package Classwork_21;

import java.util.*;

public class GiantTurnip {
    public static void main(String[] args) {
        Queue<Person> queue = new PriorityQueue<>(1);
        queue.add(new Person("turnip",27));
        queue.add(new Person("mouse",1));
        queue.add(new Person("old man",10));
        queue.add(new Person("old woman",7));
        queue.add(new Person("granddaughter",5));
        queue.add(new Person("dog",3));
        queue.add(new Person("cat",2));
//        while (!queue.isEmpty()){
//            //System.out.println(queue.poll().getName());
//            queue.peek();
//        }
        int full = 0;
        List<Person> currentQueue = new ArrayList<>();
        Person person = queue.poll();
        currentQueue.add(person);
        Person personNext = null;
        while(!queue.isEmpty()){
            full+=person.getStrength();
            personNext = queue.poll();
            currentQueue.add(personNext);
            System.out.println("The "+person.getName()+" took hold of the "+personNext.getName());
            person = personNext;
        }
        if (full>personNext.getStrength()){
            System.out.println("They all pulled and pulled, and pulled some more - and finally out came the turnip!");
        } else {
            System.out.println("They all pulled and pulled. But still they could not pull the turnip out.");
        }
    }

}

class Person implements Comparable{
    private final String name;
    private final int strength;

    Person(String name, int strength){
        this.name = name;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public int compareTo(Object o) {
        return (int) (this.getStrength() - ((Person)o).getStrength());
    }
}
