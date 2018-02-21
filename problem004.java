public class problem4
{
    public static void main(String args[])
    {
        int top = 0;
        for(int i = 325; i<1000; i++)
        {
            for (int j = 325; j<1000;j++)
            {
                int x = i*j;
                String s = ""+x;
                String s1 = s.substring(0,3);
                String s2 = s.substring(3,6);
                s2 = reverse(s2);
                if(s1.equals(s2))
                    if(x>top)
                        top =x;
            }
        }
        
        System.out.println("Largest: " + top);
    }
    
    public static String reverse(String s)
    {
        String s1 = s.substring(0,1);
        String s2 = s.substring(1,2);
        String s3 = s.substring(2,3);
        return "" + s3 + s2 + s1;
    }
}
