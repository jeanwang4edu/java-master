package study.jeanwang2dev;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by jean on 12/15/20.
 */
public abstract class HeavenlyBody {

    private final Key key;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;

    public enum BodyTypes {
        STAR,
        PLANET,
        ASTEROID,
        MOON,
        COMET,
        DWARF_PLANT
    }

    public HeavenlyBody(String name, double orbitalPeriod, BodyTypes bodyType) {

        this.key = new Key(name, bodyType);
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
    }

    public Key getKey() {
        return key;
    }

    public static Key generateKey(String name, BodyTypes bodyType) {
        return new Key(name, bodyType);
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public boolean addSatellite(HeavenlyBody moon){
        return this.satellites.add(moon);
    }

    public Set<HeavenlyBody> getSatellites(){
        return new HashSet<>(this.satellites);
    }

    // 2. a.equals(b) must return the same result as b.equals(a) - equals is symmetric.
    // make the equals and hashcode final in parent class to prevent subclass object and parent class
    // object compare and get not symmetric equal
    @Override
    public final boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
//
//        if( obj == null){
//            return false;
//        }

        if( obj instanceof HeavenlyBody){
            HeavenlyBody theObj = (HeavenlyBody) obj;
            return this.key.equals(theObj.getKey());
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.key.hashCode();
    }

    @Override
    public String toString() {
        return this.key.name + " : " + this.key.bodyType + " :  " + this.orbitalPeriod ;
    }

    public static final class Key {
        private final String name;
        private final BodyTypes bodyType;

        private Key(String name, BodyTypes bodyType) {
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
            Key key = (Key) obj;
            if( this.name.equals(key.getName())){
                return ( this.bodyType == key.getBodyType() );
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.name.hashCode() + 57 + this.bodyType.hashCode();
        }

        @Override
        public String toString() {
            return this.name + " : " + this.bodyType ;
        }
    }
}