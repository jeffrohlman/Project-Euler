public class problem3
{
    public static void main(String args[])
    {
        long x = 300425737573L;
        long y = 600851475143L;
        long top = 0;
        boolean b = true;
        
        for(long i = x; b; i-=2)
        {
            if(y%i == 0 && isPrime(i))
            {
                top = i;
                b = !b;
            }
        }
        
        System.out.println("Largest Prime Factor: " + top);
    }
    
    public static boolean isPrime(long p)
    {
        for(int i = 3; i < p; i += 2)
        {
            if(p%i == 0)
                return false;
        }
        return true;
    }
}
