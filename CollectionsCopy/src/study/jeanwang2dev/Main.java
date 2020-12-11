package study.jeanwang2dev;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Define theater Olympian with 8 rows 12 columns
        Theater theater = new Theater("Michigan Theater", 8, 12);

        // Test code to reserve Seats in theater Michigan Theater

        // first time reserve E09, succeed
        if(theater.reserveSeat("E09")) {
            System.out.println("Please Pay Now");
        } else {
            System.out.println("Sorry, seat already reserved or not exist");
        }

        // second time reserve E09, failed
        if(theater.reserveSeat("E09")) {
            System.out.println("Please Pay Now");
        } else {
            System.out.println("Sorry, seat already reserved or not exist");
        }

        // try to reserve for a seat number does not exist
        if(theater.reserveSeat("B13")) {
            System.out.println("Please Pay Now");
        } else {
            System.out.println("Sorry, seat already reserved or not exist");
        }

        List<Theater.Seat> reverseSeats = new ArrayList<>(theater.getSeats());
        Collections.reverse(reverseSeats);
        printList(reverseSeats);

        // Use sort method in Collections Framework to sort
        // with Comparator created in Theater class
        List<Theater.Seat> priceSeats = new ArrayList<>(theater.getSeats());
        priceSeats.add(theater.new Seat("B00", 13.00));
        priceSeats.add(theater.new Seat("A00", 13.00));
        Collections.sort(priceSeats, Theater.PRICE_ORDER);
        printList(priceSeats);
    }

    public static void printList(List<Theater.Seat> list){
        for(Theater.Seat seat: list){
            System.out.print(" " + seat.getSeatNumber() + " $" + seat.getPrice());
        }
        System.out.println();
        System.out.println("=====================================================");
    }

}
