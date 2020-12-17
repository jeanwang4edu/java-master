package study.jeanwang2dev;

/**
 * Created by jean on 12/15/20.
 */
public class Moon extends HeavenlyBody{

    public Moon(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.MOON);
    }
}
