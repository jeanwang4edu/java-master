package study.jeanwang2dev;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Define theater Olympian with 8 rows 12 columns
        Theater theater = new Theater("Olympian", 8, 12);

        // Print out the seatNumbers in theater Olympian
        theater.getSeats();

        // Test code to reserve Seats in theater Olympian

        // first time reserve E09, succeed
        if(theater.reserveSeat("E09")) {
            System.out.println("Please Pay Now");
        } else {
            System.out.println("Sorry, seat got taken or not exist");
        }

        // second time reserve E09, failed
        if(theater.reserveSeat("E09")) {
            System.out.println("Please Pay Now");
        } else {
            System.out.println("Sorry, seat got taken or not exist");
        }

        // first time reserve D12, succeed
        if(theater.reserveSeat("D12")) {
            System.out.println("Please Pay Now");
        } else {
            System.out.println("Sorry, seat got taken or not exist");
        }

        // put in wrong seatNumber, there isn't column 13, failed
        if(theater.reserveSeat("B13")) {
            System.out.println("Please Pay Now");
        } else {
            System.out.println("Sorry, seat got taken or not exist");
        }

        // Try to do a shallow copy of seats in theater Olympian
        // And demonstrate it is a shallow copy
        // each element refers to the same objects that were initially created on line 12
        List<Theater.Seat> seatsCopy = new ArrayList<>(theater.seats);
        printList(seatsCopy);

        // reserve seat in the seats copy and check for same seat in theater
        // it got reserved too
        seatsCopy.get(1).reserve();
        if(theater.reserveSeat("A02")) {
            System.out.println("Please pay for seat A02");
        } else {
            System.out.println("Seat already reserved");
        }

        // show the Collections Framework's shuffle, swap, min and max methods
        Collections.shuffle(seatsCopy);
        System.out.println("Printing seats copy");
        printList(seatsCopy);
        System.out.println("Printing theater.seats");
        printList(theater.seats);

        Theater.Seat minSeat = Collections.min(seatsCopy);
        Theater.Seat maxSeat = Collections.max(seatsCopy);
        System.out.println("Min seat number is " + minSeat.getSeatNumber());
        System.out.println("Max seat number is " + maxSeat.getSeatNumber());

        sortList(seatsCopy);
        System.out.println("Printing seats copy");
        printList(seatsCopy);

        // Collections class's copy method is deep copy
        // but you need to have equal amount of succeed objects in the new list
        // before you copy
        List<Integer> arrIntOne = new ArrayList<>();
        arrIntOne.add(1);
        arrIntOne.add(2);
        arrIntOne.add(3);

        List<Integer> arrIntTwo = new ArrayList<>();
        arrIntTwo.add(31);
        arrIntTwo.add(32);
        arrIntTwo.add(33);

        Collections.copy(arrIntTwo, arrIntOne);
        for(int value : arrIntTwo){
            System.out.println("Array Two value: " + value);
        }

    }

    public static void printList(List<Theater.Seat> list){
        for(Theater.Seat seat: list){
            System.out.print(" " + seat.getSeatNumber());
        }
        System.out.println();
        System.out.println("=====================================================");
    }

    public static void sortList(List<? extends Theater.Seat> list){
        for(int i = 0 ; i < list.size() - 1; i++ ){
            for(int j= i+1; j < list.size(); j++) {
                if(list.get(i).compareTo(list.get(j)) > 0 ){
                    Collections.swap(list, i, j);
                }
            }
        }
    }
}
