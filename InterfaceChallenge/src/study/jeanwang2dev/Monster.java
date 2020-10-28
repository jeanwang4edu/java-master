package study.jeanwang2dev;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISavable{

    private String name;
    private int fangs;
    private int claws;
    private boolean hasTail;

    public Monster(String name, int fangs, int claws) {
        this.name = name;
        this.fangs = fangs;
        this.claws = claws;
        this.hasTail = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFangs() {
        return fangs;
    }

    public void setFangs(int fangs) {
        this.fangs = fangs;
    }

    public int getClaws() {
        return claws;
    }

    public void setClaws(int claws) {
        this.claws = claws;
    }

    public boolean isHasTail() {
        return hasTail;
    }

    public void setHasTail(boolean hasTail) {
        this.hasTail = hasTail;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", fangs=" + fangs +
                ", claws=" + claws +
                ", hasTail=" + hasTail +
                '}';
    }

    @Override
    public List<String> write() {
        ArrayList<String> monsterInfo = new ArrayList<>();
        monsterInfo.add(0, this.name);
        monsterInfo.add(1, Integer.toString( this.fangs ));
        monsterInfo.add(2, Integer.toString( this.claws ));
        String hasTailValue = this.hasTail ? "true" : "false";
        monsterInfo.add(3, hasTailValue);
        return monsterInfo;
    }

    @Override
    public void read(List<String> savedValues) {
        if( savedValues != null && savedValues.size() != 0){
            this.name = savedValues.get(0);
            this.fangs = Integer.parseInt( savedValues.get(1) );
            this.claws = Integer.parseInt( savedValues.get(2) );
            this.hasTail = Boolean.parseBoolean( savedValues.get(3) );
//            System.out.println("here : " + this.hasTail + " and " + savedValues.get(3));
        }
    }
}
