import java.util.*;

public class problem1
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Top Number: ");
        int top = s.nextInt();
        int total = 0;
        for(int i = 0; i < top; i++)
            if(i%3 == 0 || i%5 == 0)
                total += i;
        
        System.out.println("Total: " + total);
    }
}
