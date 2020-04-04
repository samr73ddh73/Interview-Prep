/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static int LongestRepeatingSubsequence(String s1,int n,int i,int j,int[][]dp)
    {
        if(i>=n || j>=n )
            return 0;
        if(dp[i][j]!=-1)
            return dp[i][j];
        if(s1.charAt(i)==s1.charAt(j) && i!=j)
            dp[i][j]= 1+LongestRepeatingSubsequence(s1,n,i+1,j+1,dp);
        else
        {
            int c1=LongestRepeatingSubsequence(s1,n,i+1,j,dp);
            int c2=LongestRepeatingSubsequence(s1,n,i,j+1,dp);
            dp[i][j]=Math.max(c1,c2);
        }
        return dp[i][j];
        
    }
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int n=Integer.parseInt(sc.next());
		    String s=sc.next();
		    int dp[][]=new int[n][n];
		    for(int []row:dp)
		        Arrays.fill(row,-1);
            System.out.println(LongestRepeatingSubsequence(s,n,0,0,dp));
		       
		}
	}
}