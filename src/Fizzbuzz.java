/**
 * Created by bcran_0001 on 11/14/16.
 */
public class Fizzbuzz {
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++) {
            if (((i % 3) == 0) && ((i % 5) == 0))
                System.out.print("fizzbuzz");
            else if ((i % 3) == 0) System.out.print("fizz");
            else if ((i % 5) == 0) System.out.print("buzz");
            else System.out.print(i);
            System.out.println(" ");
        }
        System.out.println();
    }
}