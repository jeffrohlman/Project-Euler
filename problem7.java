public class problem7
{
    public static void main(String args[])
    {
        int tot = 1;
        int high = 0;
        for(int x = 3; tot < 10001; x++)
        {
            if(isPrime(x))
            {
                tot++;
                high = x;
            }
        }
        System.out.println("10,001 prime number: " + high);
    }
    
    public static boolean isPrime(int p)
    {
        if(p%2 == 0)
            return false;
        for(int i = 3; i < p; i += 2)
        {
            if(p%i == 0)
                return false;
        }
        return true;
    }
}
