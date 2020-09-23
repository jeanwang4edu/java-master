package study.jeanwang2dev;

import java.util.Scanner;

public class MinAndMaxInputChallenge {

    public static void getMinAndMax(){
        Scanner scanner = new Scanner(System.in);
//        int min = 0;
//        int max = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        // use a boolean flag to check the first input
//        boolean first = true;
        while(true){
            System.out.println("Enter number:");
            if( scanner.hasNextInt() ){
                int number = scanner.nextInt();
//                if( first ){
//                    first = false;
//                    max = number;
//                    min = number;
//                }
                if (number > max) max = number;
                if (number < min) min = number;

            } else {
                // break out the loop and print the minimum and maximum number
                break;
            }
            scanner.nextLine();
        }
        System.out.println("min = " + min + ", max = " + max);
        scanner.close();
    }
}
