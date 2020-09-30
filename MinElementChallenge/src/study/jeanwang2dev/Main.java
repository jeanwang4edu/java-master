package study.jeanwang2dev;

import java.util.Scanner;

public class Main {

    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int count;
        System.out.println("Please enter the number of integers you want to have in the array");
        while(true) {
            if (scanner.hasNextInt()) {
                count = scanner.nextInt();
                if (count > 0) {
                    scanner.nextLine();
                    break;
                } else {
                    System.out.println("Invalid input, must be a number and bigger than zero");
                    scanner.nextLine();
                }

            }
        }
        System.out.printf("The minimum value in the array is %d", findMin(readIntegers(count)) );
    }

    public static int[] readIntegers(int count){
        System.out.printf("Please enter %d numbers:%n", count);
        int[] intArr = new int[count];
        int i = 0;
        while(i < count){
            if( scanner.hasNextInt()){
                intArr[i] = scanner.nextInt();
                i++;
            } else {
                System.out.println("Invalid Integer, please try again:");
            }
            scanner.nextLine();
        }
        return intArr;
    }

    public static int findMin(int[] array){
        int tempInt = array[0];
        for(int i = 1; i < array.length; i++){
            if( tempInt > array[i]){
                tempInt = array[i];
            }
        }
        return tempInt;
    }
}
