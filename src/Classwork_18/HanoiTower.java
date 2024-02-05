package Classwork_18;
//Ханойская башня
/*
Рекурсивно решаем задачу «перенести башню из n−1 диска на 2-й стержень».
Затем переносим самый большой диск на 3-й стержень.
Рекурсивно решаем задачу «перенести башню из n−1 диска на 3-й стержень».
 */
public class HanoiTower {
    private static int count = 20;
    private static int[][] discs = new int[count][3]; //для хранения количества дисков
    private static int[] counts = new int[3];

    static int steps = 0;

    public static void main(String[] args) {
        init();
        System.out.println(toStringAligned());
        //moveOne(0,1);
        move(count,0,1,2);
        System.out.println(toStringAligned());
        System.out.println(steps);
    }

    //Первоначальное расположение
    public static void init() {
        for (int i = 0; i < count; i++)
            discs[i][0] = count-i;
        counts[0] = count; //Заполнили первый стержень
    }

    public static void moveOne(int source, int destination){
            discs[counts[destination]++][destination] = discs[--counts[source]][source];
            discs[counts[source]][source] = 0;
            steps++;
    }

    public static void move(int count, int source, int aux, int destination){
        if (count==1){
            moveOne(source,destination);
            return;
        } else {
            move(count-1,source,destination, aux);
            moveOne(source,destination);
            move(count-1,aux,source,destination);
        }
    }

    public static String toStringAligned() {
        StringBuilder result = new StringBuilder();
        String pad = "     ";
        for (int i = count-1; i >=0; i--) {
            for (int j = 0; j<3; j++) {
                String sNumber = Integer.toString(discs[i][j]);
                String sPadded = pad.substring(sNumber.length()) + sNumber;
                if (j == 0) result.append(sNumber);
                else
                    result.append(sPadded);
            }
            result.append("\n");
        }
        result.append("___________\n");
        return result.toString();
    }
}