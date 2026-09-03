package day44;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    static void main() {
        ArrayList<CricketStats> players = new ArrayList<>(Arrays.asList(

                new CricketStats(1, "Virat Kohli", 150, 4, 8, 27000, "India"),

                new CricketStats(2, "Rohit Sharma", 100, 2, 6, 19000, "India"),

                new CricketStats(3, "MS Dhoni", 350, 1, 5, 17000, "India"),

                new CricketStats(4, "Jasprit Bumrah", 70, 450, 3, 2500, "India"),

                new CricketStats(5, "Ben Stokes", 120, 200, 4, 11000, "England"),

                new CricketStats(6, "Joe Root", 130, 60, 3, 19000, "England"),

                new CricketStats(7, "Steve Smith", 140, 50, 2, 16000, "Australia"),

                new CricketStats(8, "Pat Cummins", 80, 300, 3, 3500, "Australia"),

                new CricketStats(9, "Babar Azam", 90, 10, 1, 14000, "Pakistan"),

                new CricketStats(10, "Kane Williamson", 110, 40, 2, 13000, "New Zealand")

        ));
        System.out.println(players.get(0).getPlayerName());
        for(CricketStats playerName : players){
            System.out.println(playerName.getPlayerName());
        }
    }
}
