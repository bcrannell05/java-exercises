/**
 * Created by bcran_0001 on 11/11/16.
 */
public class HelloWorld {
    //psvm
    //@param args. these are the arguments passed through the terminal
    public static void main(String[] args) {
        //sout
        int dayNumber = 5; //small numbers
        long myAge = 30;
        float price;
        price = (float) 2.3; //type casting
        double anoherPrice = 6.5;
        char vowel;
        vowel = 'e';
        //vowel = true;
        boolean isFriday = true;

        String day = "\"Friday\"";

        System.out.println("Hello World!!");
        System.out.print("Hello Mammoth!!");
        System.out.printf(
                "\nHello %s, today is %s, and its the %dth day of the week ",
                "Codeup",
                day,
                dayNumber
        );
    }
}
