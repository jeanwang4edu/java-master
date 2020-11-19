package study.jeanwang2dev;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        FootballPlayer banks = new FootballPlayer("Banks");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");
        SoccerPlayer john = new SoccerPlayer("John");
        SoccerPlayer brian = new SoccerPlayer( "Brian");
        SoccerPlayer smith = new SoccerPlayer("Smith");

        Team<SoccerPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        adelaideCrows.addPlayer(beckham);
        adelaideCrows.addPlayer(john);
        adelaideCrows.addPlayer(brian);
        adelaideCrows.addPlayer(smith);
        adelaideCrows.addPlayer(brian);
        Team<SoccerPlayer> anotherSoccerTeam1 = new Team<>("Random Soccer Team1");
        Team<SoccerPlayer>  anotherSoccerTeam2 = new Team<>("Random Soccer Team2");

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
        baseballTeam.addPlayer(pat);

        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        melbourne.addPlayer(joe);

        Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
        hawthorn.addPlayer(banks);
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");

        hawthorn.matchResult(melbourne, 1, 0);
        hawthorn.matchResult(fremantle, 3, 8);

        adelaideCrows.matchResult(anotherSoccerTeam1, 1, 0);
        adelaideCrows.matchResult(anotherSoccerTeam2, 1, 1 );

        System.out.println("Team: " + adelaideCrows.getName() + " has " + adelaideCrows.numPlayers() + " Players." );

        System.out.println("Ranking");
        System.out.println(adelaideCrows.getName() + ": " + adelaideCrows.ranking());
        System.out.println(anotherSoccerTeam1.getName() + ": " + anotherSoccerTeam1.ranking());
        System.out.println(melbourne.getName() + ": " + melbourne.ranking());
        System.out.println(fremantle.getName() + ": " + fremantle.ranking());
        System.out.println(hawthorn.getName() + ": " + hawthorn.ranking());

        System.out.println(adelaideCrows.compareTo(anotherSoccerTeam1));
        System.out.println(melbourne.compareTo(fremantle));
        System.out.println(hawthorn.compareTo(fremantle));

        ArrayList<Team<FootballPlayer>> teams = new ArrayList<>();
        teams.add(melbourne);
        teams.add(hawthorn);
        teams.add(fremantle);
        Collections.sort(teams);
        for(Team<FootballPlayer> team : teams ){
            System.out.println(team.getName());
        }
    }


}
