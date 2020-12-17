package study.jeanwang2dev;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    private static final Map<HeavenlyBody.Key, HeavenlyBody> solarSystem = new HashMap<>();
    private static final Set<HeavenlyBody> planets = new HashSet<>();

    public static void main(String[] args) {
        /*
        Modify the previous HeavenlyBody example so that the HeavenlyBody
        class also has a "bodyType" field. This field will store the
        type of HeavenlyBody (such as STAR, PLANET, MOON, etc).
        You can include as many types as you want, but must support at
        least PLANET and MOON.
        For each of the types that you support, subclass the HeavenlyBody class
        so that your program can create objects of the appropriate type.
        Although astronomers may shudder at this, our solar systems will
        allow two bodies to have the same name as long as they are not the
        same type of body: so you could have a star called "BetaMinor" and
        an asteroid also called "BetaMinor", for example.
        Hint: This is much easier to implement for the Set than it is for the Map,
        because the Map will need a key that uses both fields.
        There is a restriction that the only satellites that planets can have must
        be moons. Even if you don't implement a STAR type, though, your program
        should not prevent one being added in the future (and a STAR's satellites
        can be almost every kind of HeavenlyBody).
        Test cases:
        1. The planets and moons that we added in the previous video should appear in
        the solarSystem collection and in the sets of moons for the appropriate planets.
        2. a.equals(b) must return the same result as b.equals(a) - equals is symmetric.
        3. Attempting to add a duplicate to a Set must result in no change to the set (so
        the original value is not replaced by the new one).
        4. Attempting to add a duplicate to a Map results in the original being replaced
        by the new object.
        5. Two bodies with the same name but different designations can be added to the same set.
        6. Two bodies with the same name but different designations can be added to the same map,
        and can be retrieved from the map.
*/
	    // recreate the code of Instructor’s solution to Set Challenge
        HeavenlyBody temp, sun;
        HeavenlyBody tempMoon;

        // Sun
        sun = new Star("Sun", 0);
        solarSystem.put(sun.getKey(), sun);

       // Mercury
        temp = new Planet("Mercury", 88);
        planets.add(temp);
        solarSystem.put(temp.getKey(), temp);

        // Venus
        temp = new Planet("Venus", 225);
        planets.add(temp);
        solarSystem.put(temp.getKey(), temp);

        // Earth
        temp = new Planet("Earth", 365);
        planets.add(temp);
        solarSystem.put(temp.getKey(), temp);

        tempMoon = new Moon("Moon", 27);
        temp.addSatellite( tempMoon ); // temp is Earth
        solarSystem.put(tempMoon.getKey(), tempMoon);

        // Mars
        temp = new Planet("Mars", 687);
        planets.add(temp);
        solarSystem.put(temp.getKey(), temp);

        tempMoon = new Moon("Deimos", 1.3);
        temp.addSatellite(tempMoon); // temp is Mars
        solarSystem.put(tempMoon.getKey(), tempMoon);
        solarSystem.put(temp.getKey(), temp);

        tempMoon = new Moon("Phobos", 0.3);
        temp.addSatellite(tempMoon); // temp is Mars
        solarSystem.put(tempMoon.getKey(), tempMoon);
        solarSystem.put(temp.getKey(), temp);

        // Jupiter
        temp = new Planet("Jupiter", 4332);
        planets.add(temp);
        solarSystem.put(temp.getKey(), temp);

        temp.addSatellite( sun ); // try to add non-moon to Jupiter as a satellite

        tempMoon = new Moon("Io", 1.8);
        temp.addSatellite(tempMoon); // temp is Jupiter
        solarSystem.put(tempMoon.getKey(), tempMoon);
        solarSystem.put(temp.getKey(), temp);

        tempMoon = new Moon("Europa", 3.5);
        temp.addSatellite(tempMoon); // temp is Jupiter
        solarSystem.put(tempMoon.getKey(), tempMoon);
        solarSystem.put(temp.getKey(), temp);

        tempMoon = new Moon("Ganymede", 7.1);
        temp.addSatellite(tempMoon); // temp is Jupiter
        solarSystem.put(tempMoon.getKey(), tempMoon);
        solarSystem.put(temp.getKey(), temp);

        tempMoon = new Moon("Callisto", 16.7);
        temp.addSatellite(tempMoon); // temp is Jupiter
        solarSystem.put(tempMoon.getKey(), tempMoon);
        solarSystem.put(temp.getKey(), temp);

        // Saturn
        temp = new Planet("Saturn", 10759);
        planets.add(temp);
        solarSystem.put(temp.getKey(), temp);

        // Uranus
        temp = new Planet("Uranus", 30660);
        planets.add(temp);
        solarSystem.put(temp.getKey(), temp);

        // Neptune
        temp = new Planet("Neptune", 165);
        planets.add(temp);
        solarSystem.put(temp.getKey(), temp);

        // Pluto
        temp = new Planet("Pluto", 248);
        planets.add(temp);
        solarSystem.put(temp.getKey(), temp);

        // print out planets set
        System.out.print("Planets: ");
        printSet(planets);

         // Add another Planet Pluto with different orbitalPeriod to set, will not be added
        temp = new Planet("Pluto", 842);
        planets.add(temp);
        solarSystem.put(temp.getKey(), temp);

        // Add a Dwarf_Planet Pluto with different orbitalPeriod to set and map, will be added
        // because this one has a different key than the original one
        temp = new Dwarf_planet("Pluto", 992);
        planets.add(temp);
        solarSystem.put(temp.getKey(), temp);

        // print out planets set again
        System.out.print("Planets again: ");
        printSet(planets);


        // Create a set to contain all the moons in the solar system
        // by looping through each planet and add its satellites
        Set<HeavenlyBody> moons = new HashSet<>();
        for(HeavenlyBody body: planets){
            moons.addAll(body.getSatellites());
        }

        // print out one planet's satellites
        String planetName = "Jupiter";
        HeavenlyBody.Key elementKey = HeavenlyBody.generateKey(planetName, HeavenlyBody.BodyTypes.PLANET);
        System.out.print("All Satellites of the Planet : " + planetName + " ");
        printSet(solarSystem.get(elementKey).getSatellites());

        // print out all the moons in the solar system
        System.out.print("All Moons in Solar System: ");
        printSet(moons);

        HeavenlyBody dwarf_planet = new Dwarf_planet("Ceres", 1682);
        HeavenlyBody comet = new Comet("Halley's Comet", 27375);
        HeavenlyBody asteroid1 = new Asteroid("Pallas", 1686);
        HeavenlyBody asteroid2 = new Asteroid("Pallas", 1686);

        solarSystem.put(dwarf_planet.getKey(), dwarf_planet);
        solarSystem.put(comet.getKey(), comet);
        solarSystem.put(asteroid1.getKey(), asteroid1);

        // add Pallas again with differ orbital Period will replace the original one
        asteroid2 = new Asteroid("Pallas", 16);
        solarSystem.put(asteroid2.getKey(), asteroid2);

        System.out.println(dwarf_planet.equals(comet));
        System.out.println(comet.equals(dwarf_planet));
        System.out.println(asteroid1.equals(asteroid2));
        System.out.println(asteroid2.equals(asteroid1));

        // print out solar system map
        System.out.print("All Elements in Solar System: ");
        printMap(solarSystem);

        // retrieve elements from Map
        System.out.println(solarSystem.get(HeavenlyBody.generateKey("Mercury", HeavenlyBody.BodyTypes.PLANET)));
        System.out.println(solarSystem.get(HeavenlyBody.generateKey("Halley's Comet", HeavenlyBody.BodyTypes.COMET)));

    }

    public static void printSet(Set<HeavenlyBody> set){
        System.out.println("There are " + set.size() + " elements");
        for(HeavenlyBody body : set){
            System.out.println("\t" + body.getKey() + " -- " + body.getOrbitalPeriod());
        }
    }

    public static void printMap(Map<HeavenlyBody.Key, HeavenlyBody> map){
        System.out.println("There are " + map.size() + " elements");
        for(HeavenlyBody.Key key : map.keySet()){
            System.out.println("\t" + map.get(key).toString());
        }
    }
}
