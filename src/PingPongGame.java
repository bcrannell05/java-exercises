import java.util.Scanner;

public class PingPongGame {
    public static void main(String[] args) {
        int playerScore = 0;
        int cpuScore = 0;
        Scanner input = new Scanner(System.in);

        // the game will be over if either the player or the cpu
        // have 7 points
        do {
            // User turn
            // ask the user for a side
            System.out.println(
                    "What side of the table would you like to swing? (left or right)"
            );
            String side = input.next();
            // let the cpu guess with a random number
            long random = Math.round(Math.random());
            // if user guesses she gets a point
            // left = 0, right = 1
            long sideNumber = "left".equalsIgnoreCase(side) ? 0 : 1;
            //playerScore += (random == sideNumber) ? 1 : 0;
            if (random == sideNumber) {
                playerScore++;
            }
            System.out.println(
                    "Player score is " + playerScore
                            + ", CPU score is " + cpuScore
            );

            // CPU turn
            // cpu will generate a random number
            random = Math.round(Math.random());
            // ask the user to guess the number
            System.out.println(
                    "What side of the table the ball is going to? (left or right)"
            );
            side = input.next();
            sideNumber = "left".equalsIgnoreCase(side) ? 0 : 1;
            // if cpu guesses it gets a point
            if (random == sideNumber) {
                cpuScore++;
            }
            System.out.println(
                    "Player score is " + playerScore
                            + ", CPU score is " + cpuScore
            );
        } while (playerScore < 7 && cpuScore < 7);

        // Determine the winner
        if (playerScore == 7) {
            System.out.println("Player won!!!");
        } else {
            System.out.println("CPU won!!!");
        }
    }
}