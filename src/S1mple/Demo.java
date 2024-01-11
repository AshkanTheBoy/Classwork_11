package S1mple;

public class Demo {
    public static void main(String[] args) {
        PenCIL pencil  = new PenCIL(Color.BLACK);
        PenCIL pencil2  = new PenCIL(Color.WHITE);
        //Class //Object //Constructor

        System.out.println(pencil);
        System.out.println(pencil2);

        Car car = new Car();

        System.out.println(car);
        //car.color = Color.GREEN; //вот так низя делать
        car.setColor(Color.BLACK);
        System.out.println(car);

        Variety variety = Variety.FUJI;
        System.out.println(variety);

        Apple apple = new Apple(0.2, Variety.GALA);
        System.out.println(apple);
        System.out.println(Variety.GALA.getTaste());

        System.out.println(apple.getWeight());

    }
}

