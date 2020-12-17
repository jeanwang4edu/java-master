package study.jeanwang2dev;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by jean on 12/17/20.
 */
public abstract class HeavenlyBody {

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

    private final Key key;
    private final double orbitalPeriod;
    // final means that the variable cannot be re-bound to reference another object,
    // but internal state of the object pointed by that reference variable can be changed
    // i.e. you can add or remove elements from final array or final collection
    private final Set<HeavenlyBody> satellites;

    public enum BodyTypes {
        STAR,
        PLANET,
        COMET,
        ASTEROID,
        DWARF_PLANET,
        MOON
    }

    public HeavenlyBody(String name, double orbitalPeriod, BodyTypes bodyType) {
        this.key = new Key(name, bodyType);
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
    }

    public static Key generateKey(String name, BodyTypes bodyTypes){
        return new Key(name, bodyTypes);
    }

    public boolean addSatellite(HeavenlyBody body){
        return this.satellites.add(body);
    }

    public Key getKey() {
        return key;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
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

        if( obj instanceof HeavenlyBody) {
            return this.key.equals( ((HeavenlyBody) obj).key);
        }

        return false;

    }

    @Override
    public int hashCode() {
        return this.key.hashCode();
    }

    @Override
    public String toString() {
        return this.key + " : " + this.orbitalPeriod;
    }

    public static final class Key {

        private final String name;
        private final BodyTypes bodyType;

        public Key(String name, BodyTypes bodyType) {
            this.name = name;
            this.bodyType = bodyType;
        }

        public String getName() {
            return name;
        }

        public BodyTypes getBodyType() {
            return bodyType;
        }

        @Override
        public boolean equals(Object obj) {
            if( this == obj) {
                return true;
            }
            if( obj == null) {
                return false;
            }
            Key theObj = (Key) obj;
            if( this.getName().equals(theObj.getName()) ){
                return ( this.getBodyType() == theObj.getBodyType() );
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.name.hashCode() + 31 + this.bodyType.hashCode();
        }

        @Override
        public String toString() {
            return this.name + " : " + this.bodyType;
        }
    }

}
