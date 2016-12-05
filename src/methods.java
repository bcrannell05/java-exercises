import java.util.Scanner;

public class methods {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            float num1;
            float num2;

            System.out.print("Enter the first number:");
            num1 = input.nextInt ();

            System.out.print("Enter the second number:");
            num2 = input.nextInt ();

            System.out.println();
            System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
            System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
            System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
            System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));


        }
    }