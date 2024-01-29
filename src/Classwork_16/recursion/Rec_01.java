package Classwork_16.recursion;

public class Rec_01 {
    static int index = 0;
    public static void main(String[] args) {
        System.out.println(sum(5));
    }

    static void recurse(){
        if (index>=5){
            return;
        }
        index++;
        System.out.println("yo");
        recurse();
    }

    static void recurse(int index){
        if (index>=5){
            return;
        }
        System.out.println("yo");
        recurse(index+1);
    }

    static int sum(int number){
        if (number<=0){
            return number;
        }
        return number+sum(number-1);
    }
}
