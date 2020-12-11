package study.jeanwang2dev;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jean on 12/11/20.
 */
public class MapProgram {

    public static void main(String[] args) {
        // create an instance of key value class Map
        Map<String, String> languages = new HashMap<>();

        // Demonstrate usage of method containsKey, put, replace, keySet, get and remove
        if( languages.containsKey("Java")){
            System.out.println("Java already exists");
        } else {
            languages.put("Java", "a compiled high level, object-oriented, platform independent language");
            System.out.println("Java added successfully");
        }

        languages.put("Python", "a interpreted, object-oriented, high-level programming language with dynamic semantics");
        languages.put("Algol", "an algorithmic language");
        System.out.println( languages.put("BASIC", "Beginners All Purposes Symbolic Instruction Code") );
        System.out.println( languages.put("Lisp", "Therein lies madness") );

        if( languages.containsKey("Java")){
            System.out.println("Java is already in the map");
        } else {
            languages.put("Java", "This course is about Java");
        }

        System.out.println("========================================================");

//        languages.remove("Lisp");
        if(languages.remove("Algol", "an algorithmic language" )){
            System.out.println("Algol got removed");
        } else {
            System.out.println("Algol not removed, key/value pair not found");
        }

        if( languages.replace("Lisp", "This will not work", "a functional programming language with imperative features")){
            System.out.println("Lisp got replaced");
        } else {
            System.out.println("Lisp was not replaced");
        }

        for(String key: languages.keySet()){
            System.out.println(key + " : " + languages.get(key));
        }


    }
}
