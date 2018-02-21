import java.util.*;

public class problem6
{
    public static void main(String args[])
    {
        int tot1 = 0;
        int tot2 = 0;
        for(int i = 1; i <= 100; i++)
        {
            tot1 += Math.pow(i,2);
        }
        
        for(int i = 1; i <= 100; i++)
        {
            tot2 += i;
        }
        
        tot2 = (int)Math.pow(tot2,2);
        
        System.out.println("Difference: " + (tot2 - tot1));
    }
}
