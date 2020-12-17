package study.jeanwang2dev;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by jean on 12/17/20.
 */
public class HeavenlyBody {

//    Create class HeavenlyBody with: name, orbitalPeriod (double), and a set of satellites.
//    Create a constructor initializing only first two, and just creating new HashSet.
//    Create getters for name, orbitalPeriod and satellites.
//    Create boolean addMoon method, that adds moon of HeavenlyBody type to the set of satellites.
//    Override equals method: if this and obj are equal (==)*, that is, it was created as another reference to the same object (obj),
//    or ‘the same object in memory’, then return… a proper return;
//    if the object is null, or it is not of the same type as this object (to compare to)**, do a proper return;
//    then get the object’s name by creating a reference String variable objName and assigning to it the following:
//    casting our obj to HeavenlyBody type plus getting the name;
//    and return the result of the default equals method applied from this name to/on objName.
//    *== operator is used for reference (address) comparison, whereas equals method – for content (values) comparison
//    **use method getClass() (apply it to the objects) to distinguish parent class from subclass
//    Override hashCode() method, applying the default hashCode method to this name plus adding an arbitrary number (e.g. 57)
//    to ensure the hash code is not zero.

    private final String name;
    private final double orbitalPeriod;
    // final means that the variable cannot be re-bound to reference another object,
    // but internal state of the object pointed by that reference variable can be changed
    // i.e. you can add or remove elements from final array or final collection
    private final Set<HeavenlyBody> satellites;

    public HeavenlyBody(String name, double orbitalPeriod) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public boolean addMoon(HeavenlyBody moon){
        return this.satellites.add(moon);
    }

    public Set<HeavenlyBody> getSatellites() {
        return satellites;
    }

    @Override
    public boolean equals(Object obj) {
        if( this == obj ){
            return true;
        }

        if( obj == null ){
            return false;
        }

//        if( obj.getClass() == this.getClass()) {
            return this.name.equals(((HeavenlyBody) obj).getName());
//        }
//
//        return false;

    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + 31;
    }

    @Override
    public String toString() {
        return this.name + " -- OrbitalPeriod: " + this.orbitalPeriod;
    }

}
