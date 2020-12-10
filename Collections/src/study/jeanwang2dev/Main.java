package study.jeanwang2dev;

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


    }
}
