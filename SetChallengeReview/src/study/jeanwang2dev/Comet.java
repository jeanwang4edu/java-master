package study.jeanwang2dev;

/**
 * Created by jean on 12/17/20.
 */
public class Comet extends HeavenlyBody {

    public Comet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.COMET);
    }
}
