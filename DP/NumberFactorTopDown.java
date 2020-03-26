import java.util.*;
class NumberFactorTopDown
{
    public static int factors(int n,int [] arr)
    {
        if(n<0)
            return 0;
        if(arr[n]!=-1)
            return arr[n];
        if(n==0)
            arr[n]=1;
        else
            arr[n]= factors(n-1,arr)+factors(n-3,arr)+factors(n-4,arr);
        return arr[n];
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n+1];
        Arrays.fill(arr,-1);
        System.out.println(factors(n,arr));

    }
}