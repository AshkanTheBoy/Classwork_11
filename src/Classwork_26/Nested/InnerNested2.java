package Classwork_26.Nested;

public class InnerNested2 {
    public static void main(String[] args) {
        Car car = new Car();
        car.driver.drive();
        System.out.println(car.driver.getName());

        Car.Player passenger = new Car.Player();
        passenger.switchPlayer();
        passenger.switchPlayer();
        System.out.println(Car.isPlayerOn());

        car.move();
        car.play();
        System.out.println(Car.isPlayerOn());
    }
}

class Car{

    //Руль находится внутри автомобиля, поэтому private
    private int wheelAngle = 0; //Angle of rotating
    private boolean ignitionOn = false; //Key of ignition
    private static boolean playerOn = false; //Car's player
    public static boolean isPlayerOn() {
        return playerOn;
    }
    public Driver driver = new Driver();

    //Inner class
    protected class Driver{
        private String name = "Ryan Gosling";
        public void drive(){
            wheelAngle = 30;
            ignitionOn = true;
            playerOn = true;
        }
        public String getName() {
            return name;
        }
    }

    //static inner class
    public static class Player{
        public void switchPlayer(){
            playerOn = !playerOn;
        }
    }

    //Local class
    public void move(){
        class Navigator{
            public void navigate(){
                System.out.println("navigate");
            }
        }
        Navigator navigator = new Navigator();
        navigator.navigate();
    }

    //Чтобы создать анонимный класс, нужен родительский класс или интерфейс
    interface Remotable{
        void remote();
    }
    //Anonymous class
    public void play(){
        new Remotable(){
            @Override
            public void remote() {
                playerOn = true;
                System.out.println(123);
            }
        }.remote();
    }

}
