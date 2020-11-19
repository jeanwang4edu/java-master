package study.jeanwang2dev;

/**
 * Created by jean on 11/19/20
 */
public abstract class Player {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
