package study.jeanwang2dev;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Create a program using arrays that sorts a list of integers in descending order
 */
public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] intArray = getIntergers(5);
        printArray(intArray);
        int[] sortedArr = sortIntegers(intArray);
        printArray(sortedArr);
        printArray(intArray);
    }

    public static int[] getIntergers(int num){
        System.out.printf("Enter %d numbers: %n", num);
        int[] inputArr = new int[num];
        int i = 0;
        while(i < num) {
            if (scanner.hasNextInt()) {
                inputArr[i] = scanner.nextInt();
                scanner.nextLine();
                i++;
            } else {
                System.out.println("Invalid number, please try again: ");
                scanner.nextLine();
            }
        }
        return inputArr;
    }

    public static void printArray(int[] array){
        System.out.println("Printing array...");
        for(int i = 0; i < array.length; i++){
            System.out.printf("Element %d: value is %d%n", i, array[i]);
        }
    }

    public static int[] sortIntegers(int[] array){
        // copy the array using Java.util.Arrays
        int[] tempArr = Arrays.copyOf(array, array.length);
        //int[] tempArr = new int[array.length];
//        for(int i = 0; i < array.length; i++){
//            tempArr[i] = array[i];
//        }
        // sort arr in descending order
//        Arrays.sort(tempArr);
//        int[] sortedArr = new int[array.length];
//        int j = array.length;
//        for(int i = 0; i < tempArr.length; i++){
//            sortedArr[j-1] = tempArr[i];
//            j--;
//        }
        boolean flag = true;
        int tempInt;
        while(flag){
            flag = false;
            for( int i = 0; i < tempArr.length - 1; i++){
                if (tempArr[i] < tempArr[i+1]) {
                    tempInt = tempArr[i];
                    tempArr[i] = tempArr[i+1];
                    tempArr[i+1] = tempInt;
                    System.out.println("comparing number: " +  tempArr[i] + " with number: " + tempArr[i+1]);
                    flag = true;
                }
            }
            System.out.println("one while loop");
        }
        return tempArr;
    }

}
