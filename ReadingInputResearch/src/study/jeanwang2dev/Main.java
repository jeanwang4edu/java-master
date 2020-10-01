package study.jeanwang2dev;

import java.util.Scanner;

public class Main {

    private static Scanner s = new Scanner(System.in);
    private static int[] baseData = new int[5];

    public static void main(String[] args) {
        System.out.println("Enter 5 integers:");
        int i = 0;
        while(i < baseData.length){

            if(s.hasNextInt()){
                baseData[i] = s.nextInt();
                s.nextLine();
                i++;
            } else {
                System.out.println("Invalid number, try again:");
                s.nextLine();
            }
        }
        printArray(baseData);
    }

    public static void printArray(int[] array){
        System.out.println("Printing array...");
        for(int i = 0; i < array.length; i++){
            System.out.printf("Element %d: value is %d%n", i, array[i]);
        }
    }
}
