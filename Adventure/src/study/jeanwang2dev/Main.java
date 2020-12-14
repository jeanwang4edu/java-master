package study.jeanwang2dev;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static final  Map<Integer, Location> locations = new HashMap<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> tempExit = new HashMap<>();
        locations.put(0, new Location(0, "You are sitting in front of a computer learning Java", null));

        // Room 1
        tempExit = new HashMap<>();
        tempExit.put("N", 5);
        tempExit.put("S", 4);
        tempExit.put("W", 2);
        tempExit.put("E", 3);
        locations.put(1, new Location(1, "You are standing at the end of a road before a small brick building", tempExit));

        // Room 2
        tempExit = new HashMap<>();
        tempExit.put("N", 5);
        locations.put(2, new Location(2, "You are at the top of a hill",tempExit));

        // Room 3
        tempExit = new HashMap<>();
        tempExit.put("W", 1);
        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring", tempExit));

        // Room 4
        tempExit = new HashMap<>();
        tempExit.put("N", 1);
        tempExit.put("W", 2);
        locations.put(4, new Location(4, "You are in a valley beside a stream", tempExit));

        // Room 5
        tempExit = new HashMap<>();
        tempExit.put("S", 1);
        tempExit.put("W", 2);
        locations.put(5, new Location(5, "You are in the forest", tempExit));

        int loc = 1;
        while( true ){
            System.out.println(locations.get(loc).getDescription());

            // remove a keySet from tempExit to test
            tempExit.remove("S");

            if(loc == 0){
                break;
            }

            Map<String, Integer> exits = locations.get(loc).getExits();
            System.out.print("Available exits are: " );
            for(String exit : exits.keySet()){
                System.out.print( exit + ", ");
            }
            System.out.println();

            String direction = scanner.nextLine().toUpperCase();

            // change the program to allow players to type full words
            // or phrases, then move to the correct location based upon their input
            // the player should be able to type commands such as "Go West", "run South" or just "East"
            // and the program will move to the appropriate location if there is one.
            // the single character command should still works

            Map<String, String> wordMap = new HashMap<>();
            wordMap.put("NORTH", "N");
            wordMap.put("SOUTH", "S");
            wordMap.put("EAST", "E");
            wordMap.put("WEST", "W");
            wordMap.put("QUIT", "Q");

            if( direction.length() > 1 ) {
                // if the input direction is not single character
                // split the direction into String array
                String[] wordsArr = direction.split(" ");
                for (String word : wordsArr) {
                    if (wordMap.containsKey(word)) {
                        if (exits.containsKey(wordMap.get(word))) {
                            direction = wordMap.get(word);
                            break;
                        }
                    }
                }
            }

            if( exits.containsKey( direction ) ) {
                loc = exits.get(direction);
            } else {
                System.out.println("You can not go in that direction");
            }

        }


    }
}
