package study.jeanwang2dev;

/**
 * Created by jean on 12/17/20.
 */
public class Star extends HeavenlyBody{

    public Star(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.STAR);
    }
}
