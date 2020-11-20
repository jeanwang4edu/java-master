package study.jeanwang2dev;

public class Main {

    public static void main(String[] args) {
        // ArrayList<Team> teams;
        // Collections.sort(teams);
        // Create a generic class to implement a league table for a sport.
        // The class should allow teams to be added to the list, and store
        // a list of teams that belong to the league.
        //
        // Your class should have a method to print out the teams in order,
        // with the team at the top of the league printed first.
        //
        // Only teams of the same type should be added to any particular
        // instance of the league class - the program should fail to compile
        // if an attempt is made to add an incompatible team.
        FootballPlayer joe = new FootballPlayer("Joe");
        FootballPlayer banks = new FootballPlayer("Banks");

        BaseballPlayer pat = new BaseballPlayer("Pat");

        SoccerPlayer beckham = new SoccerPlayer("Beckham");
        SoccerPlayer john = new SoccerPlayer("John");
        SoccerPlayer brian = new SoccerPlayer( "Brian");
        SoccerPlayer smith = new SoccerPlayer("Smith");

        Team<FootballPlayer> footballTeam = new Team<>("Football Team");

        Team<SoccerPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        adelaideCrows.addPlayer(beckham);
        adelaideCrows.addPlayer(john);
        adelaideCrows.addPlayer(brian);
        adelaideCrows.addPlayer(smith);
        adelaideCrows.addPlayer(brian);

        Team<SoccerPlayer> hawthorn = new Team<>("Hawthorn");
        Team<SoccerPlayer> fremantle = new Team<>("Fremantle");
        Team<SoccerPlayer> melbourne = new Team<>("Melbourne");

        adelaideCrows.setDetail(7, 2, 3);
        hawthorn.setDetail(5, 6, 2);
        fremantle.setDetail( 4, 3 , 2);
        melbourne.setDetail( 5, 3, 5);

        hawthorn.matchResult(melbourne, 1, 0);
        hawthorn.matchResult(fremantle, 3, 8);

        LeagueTable<Team<SoccerPlayer>> soccerLeague = new LeagueTable("soccerLeague110");
        soccerLeague.addTeam(adelaideCrows);
        soccerLeague.addTeam(hawthorn);
        soccerLeague.addTeam(melbourne);
        soccerLeague.addTeam(fremantle);
//        soccerLeague.addTeam(footballTeam);
        soccerLeague.printTable();



    }
}
