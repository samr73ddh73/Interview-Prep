import java.util.*;
class Main{
    
    public static int MaxCut(int n)
    {
        if(n==0)
            return 1;
        int ans=0;
        for(int i=1;i<n;i++)
        {
            //if((n-i)>=0)
                ans=Math.max(MaxCut(n-i)*i,ans);
        }
        return ans;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(MaxCut(n));
    }
}