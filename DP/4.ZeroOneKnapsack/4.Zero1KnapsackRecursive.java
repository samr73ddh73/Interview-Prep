/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    public static int maxProfit(int [] wt,int [] profit,int capacity,int i)
    {
        if(capacity<=0 || i>=wt.length)
            return 0;
        int c1=0;
        if(capacity>=wt[i])
            c1=profit[i]+maxProfit(wt,profit,capacity-wt[i],i+1);
        int c2=maxProfit(wt,profit,capacity,i+1);
        return Math.max(c1,c2);
    }
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int capacity=sc.nextInt();
		    int wt[]=new int[n];
		    int profit[]=new int[n];
		    for(int i=0;i<n;i++)
		        profit[i]=sc.nextInt();
		    for(int i=0;i<n;i++)
		        wt[i]=sc.nextInt();
	
		    System.out.println(maxProfit(wt,profit,capacity,0));
		       
		}
	}
}