package study.jeanwang2dev;

import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        double avg = 0d;
        int counter = 0;
//        System.out.println("Please enter numbers: ");
        while(true){
            if( scanner.hasNextInt() ){
                int num = scanner.nextInt();
                scanner.nextLine();
                counter++;
                sum += num;
                avg = sum / counter ;
            } else {
                break;
            }
        }
        System.out.printf("SUM = %d AVG = %d", (int)sum, Math.round(avg) );
        scanner.close();
    }
}
