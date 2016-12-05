public class CircleApplication {
    public static void main(String[] args) {

        String userWantsToContinue = "n";

        System.out.println("Welcome to the Circle calculating application!");
        System.out.println("So far, you have created " + Circle.getNumberOfCirclesProduced() + " circles.");

        do {
            // prompt user to enter a circle radius
            // Display an error if the user enters invalid data.
            double radius = Validator.getPositiveDouble("What's the radius? ");

            Circle circle = new Circle(radius);
            System.out.println("Your circle's area is " + circle.getFormattedArea());

            System.out.println("Your circle's circumference is " + circle.getFormattedCircumference());

            // Ask if the user wants to continue.
            userWantsToContinue = Validator.getString("Do you want to continue y/n? ");

        } while(userWantsToContinue.equalsIgnoreCase("y") || userWantsToContinue.equalsIgnoreCase("yes"));

        // show how many circles the user created using the application
        System.out.println("You have produced " + Circle.getNumberOfCirclesProduced() + " circles, yay!");
        System.out.println("Goodbye");
    }

}