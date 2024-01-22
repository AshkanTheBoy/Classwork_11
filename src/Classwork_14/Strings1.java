package Classwork_14;

public class Strings1 {
    public static void main(String[] args) throws InterruptedException {
        String s = "hello";
        System.out.print(s);
        int index = 0;
        while(true){
            Thread.sleep(400);
            for (int i = 0; i < 5; i++) {
                System.out.print("\b");
            }
            StringBuilder sb = new StringBuilder(s);
            sb.setCharAt(index,Character.toUpperCase(sb.charAt(index)));
            System.out.print(sb);
            index++;
            if (index==5){
                index = 0;
            }
        }







    }
}
