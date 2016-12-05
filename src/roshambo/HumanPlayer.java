package roshambo;

public class HumanPlayer extends Player {

    @Override
    public String generateRoshambo() {
        // prompt user for choice
        String message = "Choose your weapon! \n 1) Rock 2) Paper 3) Scissors";
        String selection = "";

        int choice = Validator.getIntWithinRange(message, 1, 3);

        if(choice == 1) {
            selection = Roshambo.ROCK.toString();
        } else if (choice == 2) {
            selection = Roshambo.PAPER.toString();
        } else if(choice == 3) {
            selection = Roshambo.SCISSORS.toString();
        }

        return selection;
    }


}