package Classwork_16.recursion;

public class Sub {
    public static void main(String[] args) {
        sub(0);
    }

    static void sub(int depth){
        if (depth>=5){
            return;
        }
        System.out.println(depth);
        sub(depth+1);
        System.out.println(depth);

    }
}
