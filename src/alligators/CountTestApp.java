package alligators;

public class CountTestApp extends CountUtil {

    public static void main(String agrs[]) throws CloneNotSupportedException
    {

        //count alligators
        System.out.println("Counting alligators..." + "\n");

        //create a new Alligator object called "a"
        Countable a = new Alligator();
        count(a,3);

        //count sheep
        System.out.println();
        System.out.println("Counting sheep..." + "\n");

        //create a new Sheep object called "s"
        Countable s = new Sheep();
        Sheep s1 = new Sheep();
        //resets the count to 0
        s1.resetCount();
        //sets sheep name to "Blackie"
        s1.setSheepName(" Blackie");
        //counts the first sheep two times
        count(s1,2);

        System.out.println();

        //clone sheep object
        //clones the first sheep object
        Sheep s2 = (Sheep) s1.clone();
        //resets the count to 0
        s2.resetCount();
        //changes and sets the sheep name to "Dolly"
        s2.setSheepName(" Dolly");
        //counts the second sheep three times
        count(s2,3);

        System.out.println();

        //resets the first sheep object count to 0
        s1.resetCount();
        //sets first sheep object name to "Blackie"
        s1.setSheepName(" Blackie");
        //counts the first sheep object one time
        count(s1,1);

    }

}