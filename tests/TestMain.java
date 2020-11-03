import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

public class TestMain 
{

    @Test
    public void sumListTest() 
    {
        assertEquals("Failed to get the correct sum.", 45, Main.sumList(new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9))));
    }

    @Test
    public void listMaxTest()
    {
        assertEquals("Failed to find the correct max value.", 10, Main.listMax(new ArrayList<Integer>(Arrays.asList(1,5,10,3,5,7,2,5))));
    }

    @Test
    public void removeMatchingTest()
    {
        ArrayList<String> strList = new ArrayList<String>(Arrays.asList("a", "b", "c", "d", "b", "c"));
        Main.removeMatching("b", strList);
        assertEquals("Result list is the wrong size.", 4, strList.size());
        assertFalse("Item to remove is still in list.", strList.contains("b"));
    }
}