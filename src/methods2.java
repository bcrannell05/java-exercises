import java.util.Scanner;

public class methods2 {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        int number;
        System.out.print("Enter a number between 1-10: ");
        number = input.nextInt();
        int result = factorial(number);
        System.out.println("The factorial of " + number + " is " + result);
    }

    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }
}
