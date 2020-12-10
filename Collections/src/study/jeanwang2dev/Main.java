package study.jeanwang2dev;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        String str = 'A' + String.format("%02d", 23);
//        System.out.printf("num value is " + str);

        Theater theater = new Theater("Olympian", 8, 12);

//        theater.getSeats();
        if(theater.reserveSeat("E09")) {
            System.out.println("Please Pay Now");
        } else {
            System.out.println("Sorry, seat got taken or not exist");
        }

        if(theater.reserveSeat("E09")) {
            System.out.println("Please Pay Now");
        } else {
            System.out.println("Sorry, seat got taken or not exist");
        }

        if(theater.reserveSeat("D12")) {
            System.out.println("Please Pay Now");
        } else {
            System.out.println("Sorry, seat got taken or not exist");
        }

        if(theater.reserveSeat("B13")) {
            System.out.println("Please Pay Now");
        } else {
            System.out.println("Sorry, seat got taken or not exist");
        }

        List<Theater.Seat> seatsCopy = new ArrayList<>(theater.seats);
        printList(seatsCopy);

        seatsCopy.get(1).reserve();
        if(theater.reserveSeat("A02")) {
            System.out.println("Please pay for seat A02");
        } else {
            System.out.println("Seat already reserved");
        }

        Collections.shuffle(seatsCopy);
        System.out.println("Printing seats copy");
        printList(seatsCopy);
        System.out.println("Printing theater.seats");
        printList(theater.seats);

        Theater.Seat minSeat = Collections.min(seatsCopy);
        Theater.Seat maxSeat = Collections.max(seatsCopy);
        System.out.println("Min seat number is " + minSeat.getSeatNumber());
        System.out.println("Max seat number is " + maxSeat.getSeatNumber());

    }

    public static void printList(List<Theater.Seat> list){
        for(Theater.Seat seat: list){
            System.out.print(" " + seat.getSeatNumber());
        }
        System.out.println();
        System.out.println("=====================================================");
    }
}
