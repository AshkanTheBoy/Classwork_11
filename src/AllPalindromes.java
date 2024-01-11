import java.util.Arrays;

public class AllPalindromes {
    public static void main(String[] args) {
        printResult(makeArray(countLength()));
    }

    static boolean prime (int num){
        if (num<2)
            return false;
        double s= Math.sqrt(num);
        for (int i=2; i<=s;i++)
            if (num%i==0)
                return false;
        return true;
    }


    static int countLength(){
        int count = 0;
        for (int num = 100; num < 1000; num++) {
            if (num/100==num%10 && prime(num)) {
                count++;
            }
        }
        return count;
    }

    static int[] makeArray(int count){
        int[] Palindromes = new int[count];
        int index = 0;
        for (int num = 100; num < 1000; num++) {
            if (num/100==num%10 && prime(num)) {
                Palindromes[index++] = num;
            }
        }
        return Palindromes;
    }

    static void printResult(int[] result){
        System.out.println(Arrays.toString(result));
    }
}
