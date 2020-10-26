package study.jeanwang2dev;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        LinkedList<Song> playlist = new LinkedList<>();

        Album albumOne = new Album("Believe in Me");
        albumOne.addSong("Creo En Mi", 4.13);
        albumOne.addSong("Love", 4.04);
        albumOne.addSong("I am not a singer", 5.24);
        albumOne.addSong("Friends", 3.52);

        Album albumTwo = new Album("Princess Mononoke");
        albumTwo.addSong("Ashitaka and San", 5.45);
        albumTwo.addSong("Princess Mononoke", 8.20);
        albumTwo.addSong("The Legend of Ashitaka", 3.56);

//        playlist.add(albumOne.getSong("Creo En Mi"));
//        playlist.add(albumOne.getSong("Friends"));
//        playlist.add(albumTwo.getSong("Ashitaka and San"));
//        playlist.add(albumOne.getSong("I am not a singer"));
//        playlist.add(albumTwo.getSong("Princess Mononoke"));

        albumOne.addToPlayList(0, playlist);
        albumOne.addToPlayList("I am not a singer", playlist);
        albumTwo.addToPlayList(1, playlist);
        albumOne.addToPlayList("Love",playlist);
        albumTwo.addToPlayList(2, playlist);

        play(playlist);

    }

    public static void play(LinkedList<Song> playlist){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingFoward = true;
        ListIterator<Song> listIterator = playlist.listIterator();

        if(playlist.isEmpty()){
            System.out.println("No songs in the playlist");
            return;
        } else {
            System.out.println("Now playing ---- " + listIterator.next().toString());
            printMenu();
        }

        while(!quit){
//            System.out.println("Please enter the action command that you want to perform:");
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action){
                case 0:
                    System.out.println("Quit playing, close program.");
                    quit = true;
                    break;
                case 1:
                    // playing forward, next song
                    if( !goingFoward ){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        goingFoward = true;
                    }
                    if( listIterator.hasNext()){
                        System.out.println("Now playing --- " + listIterator.next().toString());
                    } else {
                        System.out.println("Reached the end of the list");
                        goingFoward = false;
                    }
                    break;
                case 2:
                    // playing backward, last song
                    if( goingFoward ){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        goingFoward = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now playing --- " + listIterator.previous().toString());
                    } else {
                        System.out.println("Reached the beginning of the list");
                        goingFoward = true;
                    }
                    break;
                case 3:
                    if(goingFoward){
                        if(listIterator.hasPrevious()){
                            System.out.println("Now replaying --- " + listIterator.previous().toString());
                            goingFoward = false;
                        } else {
                            System.out.println("Reached the beginning of the list");

                        }
                    } else{
                        if(listIterator.hasNext()){
                            System.out.println("Now replaying --- " + listIterator.next().toString());
                            goingFoward = true;
                        } else {
                            System.out.println("Reached the end of the list");
                        }
                    }
                    break;
                case 4:
                    listSongs(playlist);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if(playlist.size() > 0 ){
                        System.out.println("Removing the song you are playing...");
                        listIterator.remove();
                        if( listIterator.hasNext()){
                            System.out.println("Now playing " + listIterator.next().toString());
                        } else  if(listIterator.hasPrevious()){
                            System.out.println("Now playing " + listIterator.previous().toString());
                        }
                    } else {
                        System.out.println("The playlist is empty!");
                    }
                    break;
            }

        }
    }

    private static void printMenu(){
        System.out.println("Available actions:\npress");
        System.out.println("0 - to quit\n" +
                "1 - play the next song\n" +
                "2 - play the last song\n" +
                "3 - play the current song again\n" +
                "4 - list the songs in playlist\n" +
                "5 - print the menu options\n" +
                "6 - delete current song from playlist\n");
    }

    private static void listSongs(LinkedList<Song> playlist){
        System.out.println("===================================");
        for(Song song: playlist){
            System.out.println(song.toString());
        }
        System.out.println("===================================");
    }

}
