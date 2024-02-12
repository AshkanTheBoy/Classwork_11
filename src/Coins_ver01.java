import java.util.Arrays;

public class Coins_ver01 {
    //{1, 1, 1, 1, 1, 2, 2, 2, 3, 3, 5};
    static int[] wallet = {1,2,3,5};
    static int sum = 6;
    static int count = 0;

    public static void main(String[] args) {
        boolean enoughCoins = checkWallet();
        if (enoughCoins){
            countCombinations(0);
            System.out.println(count);
        }
    }

    public static boolean checkWallet() {
        int walletSum = 0;
        for (int coin : wallet) {
            walletSum += coin;
        }
        if (walletSum >= sum) {
            System.out.println("There are enough coins in the wallet");
            return true;
        } else {
            System.out.println("There are not enough coins in the wallet");
            return false;
        }
    }

    public static void countCombinations(int currentCoinIndex){
        if (currentCoinIndex>=wallet.length){
            return;
        }
        int combinationSum = wallet[currentCoinIndex];
            for (int j = 0; j < wallet.length; j++) {
                if (j!=currentCoinIndex) {
                    combinationSum+=wallet[j];
                    if (combinationSum>=sum){
                        count++;
                        combinationSum = wallet[currentCoinIndex];
                        //break;
                    }
                }
            }
        countCombinations(currentCoinIndex+1);
    }

//    public static int[] getCombLengths(int startingIndex){
//        if (startingIndex>=count){
//            return;
//        }
//        int[] combLengths = new int[count];
//        int combinationSum = wallet[startingIndex];
//        for (int j = 0; j < wallet.length; j++) {
//            if (j!=currentCoinIndex) {
//                combinationSum+=wallet[j];
//                if (combinationSum>=sum){
//                    count++;
//                    combinationSum = wallet[currentCoinIndex];
//                    //break;
//                }
//            }
//        }
//
//
//    }

    public static void printArr(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void printArr(int[][] arr) {
        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }
    }


}