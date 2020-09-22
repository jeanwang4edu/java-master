package study.jeanwang2dev;

import java.util.Scanner;

public class ReadingUserInputChallenge {

    public static void readTenNums(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int counter = 0;
        //while(true){
        while( counter < 10){
            System.out.printf("Enter number #%d:%n", counter+1);
            if( scanner.hasNextInt() ){
                sum += scanner.nextInt();
                counter++;
//                if(counter == 10) break;
            } else {
                System.out.println("Invalid Number, please Enter number #x again ");
            }
            scanner.nextLine();
        }
        System.out.println("the sum of all numbers you enter is: " + sum);
        scanner.close();
    }
}
