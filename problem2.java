import java.util.*;

public class problem2
{
    public static void main(String args[])
    {
        ArrayList<Integer> f = new ArrayList<Integer>();
        f.add(1);
        f.add(2);
        int i = 0;
        int x = 2;
        int total = 2;
        while(i < 4000000)
        {
            i = f.get(x-1) + f.get(x-2);
            f.add(x,i);
            x++;
            if(i%2 == 0)
                total += i;
        }
        System.out.println("Sum: " + total);
    }
}
