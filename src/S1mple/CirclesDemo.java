package S1mple;

public class CirclesDemo {
    public static void main(String[] args) {
        //Вычислить длину окружности и площадь круга
        double r1 = 1;
        double r2 = 2;
        double r3 = 3;

        double l1 = 2*Math.PI*r1;
        double s1 = Math.PI*r1*r1;
        double l2 = 2*Math.PI*r2;
        double s2 = Math.PI*r2*r2;
        double l3 = 2*Math.PI*r3;
        double s3 = Math.PI*r3*r3;
        System.out.printf("Радиус: %.2f, длина окружности: %.2f, площадь круга: %.2f%n",r1,l1,s1);
        System.out.printf("Радиус: %.2f, длина окружности: %.2f, площадь круга: %.2f%n",r2,l2,s2);

        System.out.println();
        System.out.printf("Радиус: %.2f, длина окружности: %.2f, площадь круга: %.2f%n",r3,getLength(r3),getArea(r3));

        System.out.println();
        new Circle(r2).print(); //Анонимус
        new Circle(r1).print();
        new Circle(r3).print();
        System.out.println(Circle.desc);
        System.out.println(Circle.findLength(r1));
        System.out.println(Circle.findArea(r2));
        Circle circle3 = new Circle(r3);
        System.out.println(circle3.toString());


    }

    static double getLength(double r){
        return 2*Math.PI*r;
    }

    static double getArea(double r){
        return Math.PI*r*r;
    }


}

class Circle{

    private double radius;

    private double length;

    private double area;

    public static final String desc = "Это окружность";

    public Circle(double radius) {
        this.radius = radius;
        findLength();
        findArea();
    }

    public void findLength(){
        length = 2*Math.PI*radius;
    }

    public void findArea(){
        area = Math.PI*radius*radius;
    }

    public static double findLength(double radius){
        return 2*Math.PI*radius;
    }

    public static double findArea(double radius){
        return Math.PI*radius*radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getLength() {
        return length;
    }

    public void print(){
        System.out.printf("Радиус: %.2f, длина окружности: %.2f, площадь круга: %.2f%n",radius,length,area);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", length=" + length +
                ", area=" + area +
                '}';
    }
}
