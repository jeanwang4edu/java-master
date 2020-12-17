package study.jeanwang2dev;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    private static Map<HeavenlyBody.Key, HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();
    private static Set<Star> stars = new HashSet<>();
    private static Set<HeavenlyBody> satellites = new HashSet<>();

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

        // Planets
        Star sun = new Star("Sun", 0);
        // Make the key of the map be the concatenation of HB's name and type
        solarSystem.put(sun.getKey(), sun);
        HeavenlyBody moon = new Moon("Moon", 27);
        sun.addSatellite(moon);
        stars.add(sun);
        // stars.add( ( Star) moon);
        // add moon again
//        sun = new Star("Sun", 90);
//        stars.add(sun);

//        System.out.println("Sun equals to Sun? :" + sun.equals(sun));
//        System.out.println("Moon equals to Sun? :" + moon.equals(sun));

        HeavenlyBody temp = new Planet("Mercury", 88);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);
        sun.addSatellite(temp);

        temp = new Planet("Venus", 225);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);
        sun.addSatellite(temp);

        temp = new Planet("Earth", 365);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);
        sun.addSatellite(temp);

        temp.addSatellite(moon); // temp is Earth
        temp.addSatellite(sun);

        temp = new Planet("Mars", 687);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        HeavenlyBody tempMoon = new Moon("Deimos", 1.3);
        solarSystem.put( tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon); // temp is Mars

        tempMoon = new Moon("Phobos", 0.3);
        solarSystem.put( tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon); // temp is Mars

        temp = new Planet("Jupiter", 4332);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        tempMoon = new Moon("Io", 1.8);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon); // temp is Jupiter

        tempMoon = new Moon("Europa", 3.5);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon); // temp is Jupiter

        tempMoon = new Moon("Ganymede", 7.1);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon); // temp is Jupiter

        tempMoon = new Moon("Callisto", 16.7);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon); // temp is Jupiter

        temp = new Planet("Saturn", 10759);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new Planet("Uranus", 30660);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new Planet("Neptune", 165);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new Dwarf_planet("Pluto", 248);
        solarSystem.put(temp.getKey(), temp);

        // 3. Attempting to add a duplicate to a Set must result in no change to the set (so
        // the original value is not replaced by the new one).

        // 4. Attempting to add a duplicate to a Map
        // results in the original being replaced by the new object.
        // add duplicate Pluto to Map solarSystem, replaced the one in there
        temp = new Planet( "Pluto", 942);
        planets.add(temp);
        solarSystem.put(temp.getKey(), temp);


        // print out the planets
        System.out.println("Planets");
        for(HeavenlyBody planet: planets){
            System.out.println("\t" + planet.getKey().toString());
        }

        // print out the moons of a planet
        HeavenlyBody body = solarSystem.get(HeavenlyBody.generateKey("Sun", HeavenlyBody.BodyTypes.STAR));
        System.out.println("Moons of " + body.getKey());
        for(HeavenlyBody p: body.getSatellites()) {
            System.out.println("\t" + p.getKey());
        }

        // print out the stars in solar System
        System.out.println("All stars in Star Set: ");
        for(HeavenlyBody star : stars ){
            System.out.println("\t" + star.getKey() + " OrbitalPeriod: " + star.getOrbitalPeriod());
        }

        // Populate the moons set for all the moons in solar System
        for(HeavenlyBody planet: planets){
            satellites.addAll( planet.getSatellites() );
        }

        // 5. Two bodies with the same name but different designations can be added to the same set.
        // A Star name Deimos added to the moons set
        // print out the moons in solar System
        System.out.println("All Satellites in Solar System: ");
        for(HeavenlyBody eachMoon: satellites){
            System.out.println("\t" + eachMoon.getKey() );
        }

        // 6. Two bodies with the same name but different designations can be added to the same map,
        // and can be retrieved from the map.
        // A Star name Deimos added to SolarSystem
        // print out the elements in solar System
        System.out.println("All elements in Solar System: ");
        for(HeavenlyBody.Key element: solarSystem.keySet()){
            System.out.println("\t" + solarSystem.get(element).toString() );
        }

    }
}
