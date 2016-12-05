import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */

public class BaseBallApplication {
    public static void main(String[] args) {
        int numberAtBats;
        int[] atBats;  // Declaring a variable

        Scanner scanner = new Scanner(System.in);

        String anotherBatter;
        do {
            System.out.println("Enter the number of at bats");
            numberAtBats = scanner.nextInt();
            atBats = new int[numberAtBats];

            for (int i = 0; i < atBats.length; i++) {
                System.out.println(
                        "How many bases the player earned at this bat?"
                );
                atBats[i] = getBasesEarned(scanner);
            }

            double battingAverage = calculateBattingAverage(atBats);
            double sluggingAverage = calculateSluggingAverage(atBats);

            System.out.printf(
                    "Batting average: %.3f, Slugging average: %.3f%n",
                    battingAverage,
                    sluggingAverage
            );

            anotherBatter = getAnotherBatter(scanner);

        } while ("y".equalsIgnoreCase(anotherBatter));
    }

    private static double calculateSluggingAverage(int[] atBats) {
        double sumOfBases = 0;
        for (int numberOfBases : atBats) {
            sumOfBases += numberOfBases;
        }
        return sumOfBases / atBats.length;
    }

    private static double calculateBattingAverage(int[] atBats) {
        double countOfHits = 0;
        for (int numberOfBases : atBats) {
            if (numberOfBases > 0) {
                countOfHits++;
            }
        }
        return countOfHits / atBats.length;
    }

    private static String getAnotherBatter(Scanner scanner) {
        System.out.println("Another Batter?");
        String anotherBatter = scanner.next();

        if (!"n".equalsIgnoreCase(anotherBatter)
                && !"y".equalsIgnoreCase(anotherBatter)) {
            return getAnotherBatter(scanner);
        }

        return anotherBatter;
    }

    private static int getBasesEarned(Scanner scanner) {
        try {
            int bases = scanner.nextInt();

            if (bases < 0 || bases > 4) {
                System.out.println("Please enter a number between 0 and 4");
                return getBasesEarned(scanner);
            }

            return bases;
        } catch (InputMismatchException e) {
            System.out.println("Please enter a number");
            return getBasesEarned(scanner);
        }
    }
}