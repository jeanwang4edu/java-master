package study.jeanwang2dev;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");
    private static Button btnPlay = new Button("Play");
    private static Button btnPause = new Button("Pause");

    public static void main(String[] args) {
//	    Gearbox mcLaren = new Gearbox(6);
//
//        mcLaren.operateClutch(true);
//        mcLaren.changeGear(1);
//        mcLaren.operateClutch(false);
//        System.out.println(mcLaren.wheelSpeed(1000));
//        mcLaren.changeGear(2);
//        System.out.println(mcLaren.wheelSpeed(3000) );
//        mcLaren.operateClutch(true);
//        mcLaren.changeGear(3);
//        mcLaren.operateClutch(false);
//        System.out.println(mcLaren.wheelSpeed(6000));\

        // local class
//        class ClickListener implements Button.OnClickListener{
//
//            public ClickListener() {
//                System.out.println("I have been attached");
//            }
//
//            @Override
//            public void onClick(String title) {
//                System.out.println(title + " was clicked");
//            }
//        }

        // set button
//        btnPrint.setOnClickListener(new ClickListener());
//        btnPlay.setOnClickListener(new ClickListener());
//        btnPause.setOnClickListener(new ClickListener());
//        listen();

        // anonymous class
        btnPrint.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println("Opening the Printing program...");
            }
        });
        btnPlay.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println("Playing the song on the list...");
            }
        });
        btnPause.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println("Pausing the program that is running...");
            }
        });
        listen();

    }

    private static void listen() {
        boolean quit = false;
        while(!quit){
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();
                    break;
                case 2:
                    btnPlay.onClick();
                    break;
                case 3:
                    btnPause.onClick();
                    break;
                default:
                    System.out.println("Invalid Choice!");

            }
        }
    }
}
