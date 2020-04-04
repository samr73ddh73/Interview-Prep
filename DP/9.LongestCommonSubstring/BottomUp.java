/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static int LongestCommonSubstring(String s1,String s2,int n1,int n2)
    {
       int dp[][]=new int[n1+1][n2+1];
       int max=0;
       for(int col=n2-1;col>=0;col--)
       {
           for(int row=n1-1;row>=0;row--)
           {
               if(s1.charAt(row)==s2.charAt(col))
                {
                    dp[row][col]=1+dp[row+1][col+1];
                    max=Math.max(max,dp[row][col]);
                }
                else
                {
                    dp[row][col]=0;
                }
           }
       }
       return max;
        
    }
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int n1=Integer.parseInt(sc.next());
		    int n2=Integer.parseInt(sc.next());
		    String s1=sc.next();
		    String s2=sc.next();
		    System.out.println(LongestCommonSubstring(s1,s2,n1,n2));
		       
		}
	}
}