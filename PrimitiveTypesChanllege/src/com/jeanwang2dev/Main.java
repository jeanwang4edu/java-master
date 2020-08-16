package com.jeanwang2dev;

public class Main {

    public static void main(String[] args) {
        byte myByteNumber = 69;
        short myShortNumber = 32 ;
        int myIntNumber = 1500;
        long myLongNumber = 50000L + 10L * (myByteNumber + myShortNumber + myIntNumber);
        System.out.println("the total is " + myLongNumber);

        short shortTotal = (short) (50 + 10 * ( myByteNumber + myShortNumber + myIntNumber) ) ;
        short shortValue = (short) ( 32769);
        System.out.println("the short total is " + shortValue);

        short maxNumber = Short.MAX_VALUE;
        int myIntValue = maxNumber;
        System.out.println(myIntValue);
    }
}
