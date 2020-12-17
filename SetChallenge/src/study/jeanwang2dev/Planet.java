package study.jeanwang2dev;

import java.util.Set;

/**
 * Created by jean on 12/15/20.
 */
public class Planet extends HeavenlyBody{

    public Planet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.PLANET);
    }

    // only satellites that planets can have must be moons
    @Override
    public boolean addSatellite(HeavenlyBody moon) {
        if( moon.getKey().getBodyType() == BodyTypes.MOON) {
            return super.addSatellite(moon);
        } else {
//            System.out.println("Only Moon can be added as satellite to Planet!");
//            System.out.println(moon.getName() + " is not added to " + this.getName());
            return false;
        }

    }
}
