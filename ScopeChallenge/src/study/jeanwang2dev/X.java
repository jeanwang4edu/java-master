package study.jeanwang2dev;

import java.util.Scanner;

/**
 * Created by jean on 12/8/20.
 */
public class X{
    private int x;

    public X(Scanner x) {
        System.out.print("Please enter a number:");
        this.x = x.nextInt();
    }

    // print times table for this.x
    public void x(){
        for( int x = 1; x  < 13; x++){
            System.out.println( this.x + " X " + x + " = " + x * this.x);
        }
    }

}
