package study.jeanwang2dev;

/**
 * Created by jean on 12/17/20.
 */
public class Asteroid extends HeavenlyBody {

    public Asteroid(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.ASTEROID);
    }
}
