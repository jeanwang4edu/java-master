package study.jeanwang2dev;

/**
 * Created by jean on 12/10/20.
 */
public class SomeClass {

    private static int classCounter = 0;
    public final int instanceNumber;
    private final String name;

    public SomeClass(String name) {
        this.name = name;
        classCounter++;
        instanceNumber = classCounter;
        System.out.printf("%s created, instance is %d%n", this.name, instanceNumber);
    }

    public int getInstanceNumber() {
        return instanceNumber;
    }


}
