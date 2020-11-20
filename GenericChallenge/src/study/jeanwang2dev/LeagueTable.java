package study.jeanwang2dev;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by jean on 11/19/20.
 */
public class LeagueTable<T extends Team> {

    private String name;
    private ArrayList<T> teams = new ArrayList<>();

    public LeagueTable(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addTeam(T team) {
        if( teams.contains(team)) {
            System.out.println( team.getName() + " is already in this table");
            return false;
        } else {
            teams.add(team);
            System.out.println( team.getName() + " got added to sport table " + this.name);
            return true;
        }
    }

    public int teamNum() {
        return teams.size();
    }

    public void printTable() {
        Collections.sort(this.teams);
        System.out.println("------ League Table " + this.name + " ------");
        for(T team : this.teams ){
            System.out.println(team.getName() + " : " + team.ranking() );
        }
    }


}
