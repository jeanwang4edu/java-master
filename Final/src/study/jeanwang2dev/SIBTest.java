package study.jeanwang2dev;

/**
 * Created by jean on 12/10/20.
 */
public class SIBTest {

    public static final String owner;

    static {
        owner = "jean";
        System.out.println("SIBTest static initialization block called");
    }

    public SIBTest() {
        System.out.println("SIB constructor called");
    }

    static  {
        System.out.println("2nd SIBTest static initialization block called");
    }

    public void someMethod(){
        System.out.println("SomeMethod called");
    }
}
