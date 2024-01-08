package S1mple;

public class PenCIL {
    private Color color;
    //private, protected(class scope), public(package scope), (default)((file scope))

    //Constructor
    PenCIL(Color color){
        this.color = color;
    }

    @Override
    public String toString() {
        return "PenCIL{" +
                "color=" + color +
                '}';
    }
}
