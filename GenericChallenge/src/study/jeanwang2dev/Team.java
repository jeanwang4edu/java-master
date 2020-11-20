package study.jeanwang2dev;

import java.util.ArrayList;

/**
 * Created by jean on 11/19/20.
 */
public class Team<T extends Player> implements Comparable<Team<T>> {
    private String name;
    private int played = 0;
    private int won = 0;
    private int lost = 0;
    private int tied = 0;

    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDetail(int won, int lost, int tied){
        this.won = won;
        this.lost = lost;
        this.tied = tied;
        this.played = won + lost + tied;
    }

    public boolean addPlayer(T player){
        if(members.contains(player)){
            System.out.println(player.getName() + " is already on this team");
            return false;
        } else {
            members.add(player);
            System.out.println( player.getName() + " picked for team " + this.name);
            return true;
        }
    }

    public int numPlayers(){
        return members.size();
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore){
        String message;
        if( ourScore > theirScore ){
            won++;
            message = " beat ";
        } else if( ourScore == theirScore ){
            tied++;
            message = " drew with ";
        } else{
            lost++;
            message = " lost to ";
        }
        played++;
        if(opponent != null){
            System.out.println(this.getName() + message + opponent.getName());
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking(){
        return (won * 2) + tied;
    }

    @Override
    public int compareTo(Team<T> otherTeam) {
        if( this.ranking() > otherTeam.ranking() ){
            return -1;
        } else if( this.ranking() < otherTeam.ranking()) {
            return 1;
        } else {
            return 0;
        }
    }
}
