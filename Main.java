// add your import statements here

/*
public class Main
{
    public static void main(String[] args)
    {
        // Create an ArrayList of Integers with the name intList and the numbers 1, 5, 10, 4, 6, 8, 3, 9, 2, 7 in it.
        // Create an ArrayList of Strings with the name strList and the contents "Red", "Green", "Blue", "Yellow", "Orange"

        // Uncomment these to test
        //System.out.println("The sum of the list " + intList + " is " + sumList(intList));
        //System.out.println("The max of the list " + intList + " is " + listMax(intList));

        //System.out.println("Before: " + strList);
        //removeMatching("Green", strList);
        //System.out.println("After:  " + strList);
    }

    public static int sumList(ArrayList<Integer> intList)
    {
        return 0;
    }

    public static int listMax(ArrayList<Integer> intList)
    {
        return 0;
    }

    public static void removeMatching(String match, ArrayList<String> strList)
    {

    }
}

*/

// add your import statements here
import java.util.ArrayList;
import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Integer> intList = new ArrayList<Integer>(Arrays.asList(1, 5, 10, 4, 6, 8, 3, 9, 2, 7));
        ArrayList<String> strList = new ArrayList<String>(Arrays.asList("Red", "Green", "Blue", "Yellow", "Orange"));

        System.out.println("The sum of the list " + intList + " is " + sumList(intList));
        System.out.println("The max of the list " + intList + " is " + listMax(intList));

        System.out.println("Before: " + strList);
        removeMatching("Green", strList);
        System.out.println("After:  " + strList);
    }

    public static int sumList(ArrayList<Integer> intList)
    {
        int sum = 0;
        for(int num : intList)
        {
            sum += num;
        }
        return sum;
    }

    public static int listMax(ArrayList<Integer> intList)
    {
        int max = intList.get(0);
        for(int num : intList)
        {
            if(num > max)
            {
                max = num;
            }
        }
        return max;
    }

    public static void removeMatching(String match, ArrayList<String> strList)
    {
        for(int i = 0; i < strList.size(); i++)
        {
            if(match.equals(strList.get(i)))
            {
                strList.remove(i);
                i--;
            }
        }
    }
}