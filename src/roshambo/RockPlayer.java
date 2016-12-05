package roshambo;

public class RockPlayer extends Player {

    @Override
    public String generateRoshambo() {
        // always generate a rock.
        // return Roshambo.ROCK
        return Roshambo.ROCK.toString();
    }
}