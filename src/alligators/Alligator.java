package alligators;

public class Alligator implements Countable
{

    //instance variable that stores the count
    private int count;

    //use the @Override to override the
    //Countable interface incrementCount()method
    //method increments count of Alligators by +1
    @Override
    public void incrementCount()
    {

        count++;
    }

    //overrides the Countable interface method
    @Override
    public void resetCount()
    {

        count = 0;
    }

    //overrides the Countable interface method
    @Override
    public int getCount()
    {

        return count;
    }

    //overrides the Countable interface method
    //method returns the formatted count
    @Override
    public String getCountString()
    {

        return count + "" + " Alligator";
    }
}