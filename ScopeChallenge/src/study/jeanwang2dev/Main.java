package study.jeanwang2dev;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        // enter the number that you want to type the times table for
//        System.out.print("Please enter the number:");
//        while(true){
//            if( scanner.hasNextInt() ){
//
//                break;
//            } else {
//                System.out.println("Invalid input, must be a number and bigger than zero");
//                scanner.nextLine();
//            }
//        }
//        scanner.close();

        X x = new X(new Scanner(System.in) );
        x.x();
    }

}
