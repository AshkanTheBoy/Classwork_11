package Classwork_27;

public class AbstractFactory_Game {
    public static void main(String[] args) {
        Barracks humanBarracks = new HumanBarracks();
        Warrior warrior1 = humanBarracks.createWarrior();
        warrior1.attack();
        Barracks orcBarracks = new OrcBarracks();
        Warrior warrior2 = orcBarracks.createWarrior();
        warrior2.attack();
        Barracks elfBarracks = new ElfBarracks();
        Mage mage1 = elfBarracks.createMage();
        mage1.cast();
    }
}

abstract class Barracks{
    public abstract Warrior createWarrior();
    public abstract Archer createArcher();
    public abstract Mage createMage();
}

interface Warrior{
    void attack();
}

interface Archer{
    void shoot();
}

interface Mage{
    void cast();
}

class HumanWarrior implements Warrior{

    @Override
    public void attack() {
        System.out.println("The human warrior is attacking with sword");
    }
}

class HumanArcher implements Archer{

    @Override
    public void shoot() {
        System.out.println("The human archer is shooting");
    }
}

class HumanMage implements Mage{

    @Override
    public void cast() {
        System.out.println("The human mage is casting a spell");
    }
}

class HumanBarracks extends Barracks{

    @Override
    public Warrior createWarrior() {
        return new HumanWarrior();
    }

    @Override
    public Archer createArcher() {
        return new HumanArcher();
    }

    @Override
    public Mage createMage() {
        return new HumanMage();
    }
}

class ElfWarrior implements Warrior{

    @Override
    public void attack() {
        System.out.println("The elf warrior is attacking with sword");
    }
}

class ElfArcher implements Archer{

    @Override
    public void shoot() {
        System.out.println("The elf archer is shooting");
    }
}

class ElfMage implements Mage{

    @Override
    public void cast() {
        System.out.println("The elf mage is casting a spell");
    }
}

class ElfBarracks extends Barracks{

    @Override
    public Warrior createWarrior() {
        return new ElfWarrior();
    }

    @Override
    public Archer createArcher() {
        return new ElfArcher();
    }

    @Override
    public Mage createMage() {
        return new ElfMage();
    }
}

class OrcWarrior implements Warrior{

    @Override
    public void attack() {
        System.out.println("The orc warrior is attacking with sword");
    }
}

class OrcArcher implements Archer{

    @Override
    public void shoot() {
        System.out.println("The orc archer is shooting");
    }
}

class OrcMage implements Mage{

    @Override
    public void cast() {
        System.out.println("The orc mage is casting a spell");
    }
}

class OrcBarracks extends Barracks{


    @Override
    public Warrior createWarrior() {
        return new OrcWarrior();
    }

    @Override
    public Archer createArcher() {
        return new OrcArcher();
    }

    @Override
    public Mage createMage() {
        return new OrcMage();
    }
}
