import java.util.*;
class NumberFactor
{
    public static int factors(int n)
    {
        if(n<0)
            return 0;
        if(n==0)
            return 1;
        return factors(n-1)+factors(n-3)+factors(n-4);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(factors(n));

    }
}