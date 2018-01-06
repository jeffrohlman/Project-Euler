public class problem5
{
    public static void main(String args[])
    {
        boolean b = false;
        int min = 0;
        for(int i = 2520; !b; i++)
        {
            boolean c = false;
            for(int x = 1; x <= 20 && !c; x++)
            {
                if(i%x == 0 && x == 20)
                    b = true;
                else if(i%x != 0)
                    c = true;
            }
            if(b)
                min = i;
        }
        System.out.println("Smallest: " + min);
    }
}
