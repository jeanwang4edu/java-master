package study.jeanwang2dev;

/**
 * Created by jean on 12/17/20.
 */
public class Planet extends HeavenlyBody{

    public Planet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.PLANET);
    }

    @Override
    public boolean addSatellite(HeavenlyBody body) {
        if( body.getKey().getBodyType() == BodyTypes.MOON) {
            return super.addSatellite(body);
        } else {
            return false;
        }
    }
}
