package roshambo;

public class ComputerPlayer extends Player {

    @Override
    public String generateRoshambo() {
        int random = (int) Math.ceil(Math.random() * Roshambo.values().length);
        if(random == 1) {
            choice = Roshambo.ROCK;
        } else if(random == 2) {
            choice = Roshambo.PAPER;
        } else if(random == 3) {
            choice = Roshambo.SCISSORS;
        }
        return choice.toString();
    }
}
