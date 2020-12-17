package study.jeanwang2dev;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    private static final Map<String, HeavenlyBody> solarSystem = new HashMap<>();
    private static final Set<HeavenlyBody> planets = new HashSet<>();

    public static void main(String[] args) {
	    // recreate the code of Instructor’s solution to Set Challenge
        HeavenlyBody temp;
        HeavenlyBody tempMoon;

        // Mercury
        temp = new HeavenlyBody("Mercury", 88);
        planets.add(temp);
        solarSystem.put(temp.getName(), temp);

        // Venus
        temp = new HeavenlyBody("Venus", 225);
        planets.add(temp);
        solarSystem.put(temp.getName(), temp);

        // Earth
        temp = new HeavenlyBody("Earth", 365);
        planets.add(temp);
        solarSystem.put(temp.getName(), temp);

        tempMoon = new HeavenlyBody("Moon", 27);
        temp.addMoon( tempMoon ); // temp is Earth
        solarSystem.put(tempMoon.getName(), tempMoon);

        // Mars
        temp = new HeavenlyBody("Mars", 687);
        planets.add(temp);
        solarSystem.put(temp.getName(), temp);

        tempMoon = new HeavenlyBody("Deimos", 1.3);
        temp.addMoon(tempMoon); // temp is Mars
        solarSystem.put(tempMoon.getName(), tempMoon);
        solarSystem.put(temp.getName(), temp);

        tempMoon = new HeavenlyBody("Phobos", 0.3);
        temp.addMoon(tempMoon); // temp is Mars
        solarSystem.put(tempMoon.getName(), tempMoon);
        solarSystem.put(temp.getName(), temp);

        // Jupiter
        temp = new HeavenlyBody("Jupiter", 4332);
        planets.add(temp);
        solarSystem.put(temp.getName(), temp);

        tempMoon = new HeavenlyBody("Io", 1.8);
        temp.addMoon(tempMoon); // temp is Jupiter
        solarSystem.put(tempMoon.getName(), tempMoon);
        solarSystem.put(temp.getName(), temp);

        tempMoon = new HeavenlyBody("Europa", 3.5);
        temp.addMoon(tempMoon); // temp is Jupiter
        solarSystem.put(tempMoon.getName(), tempMoon);
        solarSystem.put(temp.getName(), temp);

        tempMoon = new HeavenlyBody("Ganymede", 7.1);
        temp.addMoon(tempMoon); // temp is Jupiter
        solarSystem.put(tempMoon.getName(), tempMoon);
        solarSystem.put(temp.getName(), temp);

        tempMoon = new HeavenlyBody("Callisto", 16.7);
        temp.addMoon(tempMoon); // temp is Jupiter
        solarSystem.put(tempMoon.getName(), tempMoon);
        solarSystem.put(temp.getName(), temp);

        // Saturn
        temp = new HeavenlyBody("Saturn", 10759);
        planets.add(temp);
        solarSystem.put(temp.getName(), temp);

        // Uranus
        temp = new HeavenlyBody("Uranus", 30660);
        planets.add(temp);
        solarSystem.put(temp.getName(), temp);

        // Neptune
        temp = new HeavenlyBody("Neptune", 165);
        planets.add(temp);
        solarSystem.put(temp.getName(), temp);

        // Pluto
        temp = new HeavenlyBody("Pluto", 248);
        planets.add(temp);
        solarSystem.put(temp.getName(), temp);

        // Try to Add another Pluto with different orbitalPeriod, will not be added
        temp = new HeavenlyBody("Pluto", 842);
        planets.add(temp);

        // print out planets set
        System.out.print("Planets: ");
        printSet(planets);

        // print out solar system map
        System.out.print("All Elements in Solar System: ");
        printMap(solarSystem);

        // Create a set to contain all the moons in the solar system
        // by looping through each planet and add its satellites
        Set<HeavenlyBody> moons = new HashSet<>();
        for(HeavenlyBody body: planets){
            moons.addAll(body.getSatellites());
        }

        // print out one planet's satellites
        String planetName = "Jupiter";
        System.out.println("All Satellites of the Planet " + planetName);
        printSet(solarSystem.get(planetName).getSatellites());

        // print out all the moons in the solar system
        System.out.print("All Moons in Solar System: ");
        printSet(moons);

    }

    public static void printSet(Set<HeavenlyBody> set){
        System.out.println("There are " + set.size() + " elements");
        for(HeavenlyBody body : set){
            System.out.println("\t" + body.getName() + "-- " + body.getOrbitalPeriod());
        }
    }

    public static void printMap(Map<String, HeavenlyBody> map){
        System.out.println("There are " + map.size() + " elements");
        for(String element : map.keySet()){
            System.out.println("\t" + map.get(element).toString());
        }
    }
}
