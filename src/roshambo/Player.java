package roshambo;

import java.net.ProtocolException;

public abstract class Player {
    // Roshambo enum
    protected Roshambo choice;
    protected String name;
    protected int numberOfGamesPlayed;
    public int gamesWon;
    public int gamesLost;

    public int getNumberOfGamesPlayed() {
        return numberOfGamesPlayed;
    }

    public String generateRoshambo() {
        return "Paper";
    }

    public String getName() {
        return name;
    }


}