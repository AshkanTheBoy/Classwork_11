import java.util.Arrays;

public class AllPrimeFactors {

    public static void main(String[] args) {
        int mainNumber = 120;
        printResult(makeArray(countLength(mainNumber), mainNumber));
    }

    static boolean isPrime(int num){
        if (num<2)
            return false;
        double s= Math.sqrt(num);
        for (int i=2; i<=s;i++)
            if (num%i==0)
                return false;
        return true;
    }

    static int countLength(int mainNumber){
        int count = 0;
        for (int num = 0; num < mainNumber; num++) {
            if (isPrime(num) && mainNumber%num==0) {
                count++;
            }
        }
        return count;
    }

    static int[] makeArray(int count, int mainNumber){
        int[] Divisors = new int[count];
        int index = 0;
        for (int num = 0; num < mainNumber; num++) {
            if (isPrime(num) && mainNumber%num==0) {
                Divisors[index++] = num;
            }
        }
        return Divisors;
    }

    static void printResult(int[] result){
        System.out.println(Arrays.toString(result));
    }
}
