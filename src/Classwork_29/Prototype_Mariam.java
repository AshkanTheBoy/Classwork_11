package Classwork_29;

public class Prototype_Mariam {
    public static void main(String[] args) {
        Girl mariam = new Girl("Mariam");
        System.out.println(mariam);

        Girl notMariam = mariam.clone();
        notMariam.setLazy(false);
        notMariam.setSilly(false);
        notMariam.setName("Marriam");
        System.out.println(notMariam);
    }
}

class Girl implements Cloneable{
    private String name;
    private boolean silly = true;
    private boolean lazy = true;
    private boolean little = true;

    public Girl(String name) {
        this.name = name;
    }

    @Override
    public Girl clone() {
        try {
            Girl clone = (Girl) super.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "Girl{" +
                "name='" + name + '\'' +
                ", silly=" + silly +
                ", lazy=" + lazy +
                ", little=" + little +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSilly() {
        return silly;
    }

    public void setSilly(boolean silly) {
        this.silly = silly;
    }

    public boolean isLazy() {
        return lazy;
    }

    public void setLazy(boolean lazy) {
        this.lazy = lazy;
    }

    public boolean isLittle() {
        return little;
    }

    public void setLittle(boolean little) {
        this.little = little;
    }
}
