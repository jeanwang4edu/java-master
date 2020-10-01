package study.jeanwang2dev;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] myArr = { 1, 2, 3, 4, 5, 6};
        System.out.println("Array = " + Arrays.toString(myArr) );
        reverseTwo(myArr);
        System.out.println("Reversed Array = " + Arrays.toString(myArr) );

        int[] myArr2 = { 4,5,6,7,8,9 };
        System.out.println( "Array = " + Arrays.toString(myArr2) );
        System.out.println( "Reversed Array = " + Arrays.toString(reverseOne(myArr2)));
    }

    /**
     * reverse method one
     * @param array Array pass to reverse
     * @return reversed array
     */
    public static int[] reverseOne(int[] array){
        int[] reversedArr = new int[array.length];
        int j = array.length;
        for (int k : array) {
            reversedArr[j - 1] = k;
            j--;
        }
        return reversedArr;
    }

    /**
     * reverse method two
     * @param array Array pass to reverse
     */
    public static void reverseTwo(int[] array){
        int maxIndex = array.length -1 ;
        int halfLength = array.length / 2;
        for(int i = 0; i < halfLength; i++){
            int tempInt = array[i];
            array[i] = array[maxIndex-i];
            array[maxIndex-i] = tempInt;
        }
    }


}
