package study.jeanwang2dev;

import java.util.*;

/**
 * Created by jean on 12/10/20.
 */
public class Theater {

    private final String name;
    private final List<Seat> seats = new ArrayList<>();

    static final Comparator<Seat> PRICE_ORDER;

    static {
        PRICE_ORDER = new Comparator<Seat>() {
            @Override
            public int compare(Seat seat1, Seat seat2) {
                if (seat1.getPrice() > seat2.getPrice()) {
                    return 1;
                } else if (seat1.getPrice() < seat2.getPrice()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        };
    }

    public Theater(String name, int numRows, int seatsPerRow) {
        this.name = name;

        int lastRow = 'A' + (numRows - 1);
        for( char row = 'A'; row <= lastRow; row++){
            for( int seatNum = 1; seatNum <= seatsPerRow; seatNum++){
                double price = 12.00;
                if( row < 'D' && seatNum >= 4 && seatNum <= 9) {
                    price = 14.00;
                } else if( row > 'F' || seatNum < 4 || seatNum > 9 ) {
                    price = 7.00;
                }
                Seat seat = new Seat(row + String.format("%02d", seatNum), price);
                seats.add(seat);
            }
        }
    }

    public String getName() {
        return name;
    }

    public boolean reserveSeat(String seatNumber){
        Seat requestSeat = new Seat(seatNumber, 0);
        int foundSeat = Collections.binarySearch(seats, requestSeat, null);
        if( foundSeat >= 0){
            return  seats.get(foundSeat).reserve();
        } else {
            System.out.println("There is no seat with value " + seatNumber);
            return false;
        }
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

    public Collection<Seat> getSeats(){
        return seats;
    }

    public class Seat implements Comparable<Seat>{
        private final String seatNumber;
        private final double price;
        private boolean reserved = false;

        public Seat(String seatNumber, double price) {
            this.seatNumber = seatNumber;
            this.price = price;
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

        public double getPrice() {
            return price;
        }
    }
}


