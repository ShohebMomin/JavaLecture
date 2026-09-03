package day44;

public class CricketStats {
    // attributes : playerNumber, playerName, matchesPlayed, catchesTaken, wicketsTaken, trophiesWon, runScored, played, country
    private int playerNumber;
    private String playerName;
    private int catchesTaken;
    private int wicketsTaken;
    private int trophiesWon;
    private int runScored;
    private String playedCountry;

    public CricketStats(){}

    public CricketStats(int playerNumber,String playerName, int catchesTaken, int wicketsTaken, int trophiesWon, int runScored, String playedCountry){
        this.playerNumber = playerNumber;
        this.playerName = playerName;
        this.catchesTaken = catchesTaken;
        this.wicketsTaken = wicketsTaken;
        this.trophiesWon = trophiesWon;
        this.runScored = runScored;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getCatchesTaken() {
        return catchesTaken;
    }

    public void setCatchesTaken(int catchesTaken) {
        this.catchesTaken = catchesTaken;
    }

    public int getWicketsTaken() {
        return wicketsTaken;
    }

    public void setWicketsTaken(int wicketsTaken) {
        this.wicketsTaken = wicketsTaken;
    }

    public int getTrophiesWon() {
        return trophiesWon;
    }

    public void setTrophiesWon(int trophiesWon) {
        this.trophiesWon = trophiesWon;
    }

    public int getRunScored() {
        return runScored;
    }

    public void setRunScored(int runScored) {
        this.runScored = runScored;
    }

    public String getPlayedCountry() {
        return playedCountry;
    }

    public void setPlayedCountry(String playedCountry) {
        this.playedCountry = playedCountry;
    }

    @Override
    public String toString() {
        return STR."CricketStats{playerNumber=\{playerNumber}, playerName='\{playerName}', catchesTaken=\{catchesTaken}, wicketsTaken=\{wicketsTaken}, trophiesWon=\{trophiesWon}, runScored=\{runScored}, playedCountry='\{playedCountry}'}";
    }
}
