//Count ways to express a number as sum of consecutive numbers


import java.util.*;
import java.lang.*;
import java.io.*;

class CountWays {
    public static int bruteForce(int n)
    {
        int c=0;
        for(int i=1;i<n;i++)
		    {
		        int sum=i;
		        for(int j=i+1;j<n;j++)
		        {
		              
		            sum+=j;
		            if(sum==n)
		            {
		                c++;
		                break;
		            }
		            if(sum>n)
		                break;
		                
		        }
		    }
        return c;
    }
    public static int Optimized(int N)
    {
        
        int cnt=0;
        
        for(int L=1; L*(L+1) < 2*N; L++)
        {
            double a = (double) ((1.0*N - L*(L+1)/2)/ (double) (L+1));
            if(a - (int) a == 0.0)
                cnt++;
        }
        
        return cnt;
	    
	    
	}

	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int c1= bruteForce(n);
            int c2=Optimized(n);
		    System.out.println(c1);
             System.out.println(c2);
		}
	}
}
