import java.util.Scanner;

public class table_of_powers {
    public static void main (String[] args){
int stopNumber;
        System.out.println("Enter a stop number: ");
        Scanner sc = new Scanner(System.in);

        stopNumber = sc.nextInt();

        for(int i = 1; i <= stopNumber; i += 1){
            System.out.println(i + " squared: " + Math.pow(i, 2)+ "cubed: " + Math.pow (i, 3));

        }
    }
}
