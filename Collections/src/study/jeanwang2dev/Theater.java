package study.jeanwang2dev;

import java.util.*;

/**
 * Created by jean on 12/10/20.
 */
public class Theater {

    private final String name;
    private List<Seat> seats = new ArrayList<>();

    public Theater(String name, int numRows, int seatsPerRow) {
        this.name = name;

        int lastRow = 'A' + (numRows - 1);
        for( char row = 'A'; row <= lastRow; row++){
            for( int seatNum = 1; seatNum <= seatsPerRow; seatNum++){
                Seat seat = new Seat(row + String.format("%02d", seatNum));
                seats.add(seat);
            }
        }
    }

    public String getName() {
        return name;
    }

    public boolean reserveSeat(String seatNumber){
        int low = 0;
        int high = seats.size()-1;

        while (low <= high) {
            System.out.print(".");
            int mid = (low + high) / 2;
            Seat midVal = seats.get(mid);
            int cmp = midVal.getSeatNumber().compareTo(seatNumber);

            if (cmp < 0) {
                low = mid + 1;
            } else if (cmp > 0) {
                high = mid - 1;
            } else {
                return seats.get(mid).reserve();
            }
        }
        System.out.println("There is no seat " + seatNumber);
        return false;
//        Seat requestSeat = new Seat(seatNumber);
//        int foundSeat = Collections.binarySearch(seats, requestSeat, null);
//        if( foundSeat >= 0){
//            return  seats.get(foundSeat).reserve();
//        } else {
//            System.out.println("There is no seat with value " + seatNumber);
//            return false;
//        }

//        Seat requestSeat = null;
//        for(Seat seat: seats){
//            System.out.print(".");
//            if(seat.getSeatNumber().equals(seatNumber)){
//                requestSeat = seat;
//                break;
//            }
//        }
//        if( requestSeat == null ){
//            System.out.println("There is no seat with this number " + seatNumber);
//            return false;
//        }
//
//        return requestSeat.reserve();
    }

    // for testing
    public void getSeats(){
        for(Seat seat: seats){
            System.out.println(seat.getSeatNumber());
        }
    }

    private class Seat implements Comparable<Seat>{
        private final String seatNumber;
        private boolean reserved = false;

        public Seat(String seatNumber) {
            this.seatNumber = seatNumber;
        }

        @Override
        public int compareTo(Seat seat) {
            return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
        }

        public boolean reserve(){
            if( !this.reserved ) {
                this.reserved = true;
                System.out.println("Seat " + this.seatNumber + " reserved");
                return true;
            } else {
                return false;
            }
        }

        public boolean cancel(){
            if( this.reserved ) {
                this.reserved = false;
                System.out.println("Reservation for Seat " + this.seatNumber + " has been canceled.");
                return true;
            } else {
               return false;
            }
        }

        public String getSeatNumber() {
            return seatNumber;
        }
    }
}


