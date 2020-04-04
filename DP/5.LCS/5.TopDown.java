
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static int LongestCommonSubsequence(String s1,String s2,int n1,int n2,int i,int j,int[][] dp)
    {
        if(i>=n1 || j>=n2 || s1==null || s2==null)
            return 0;
        if(dp[i][j]!=-1)
            return dp[i][j];
        if(s1.charAt(i)==s2.charAt(j))
             dp[i][j]= 1+LongestCommonSubsequence(s1,s2,n1,n2,i+1,j+1,dp);
        else
        {int c1=LongestCommonSubsequence(s1,s2,n1,n2,i+1,j,dp);
        int c2=LongestCommonSubsequence(s1,s2,n1,n2,i,j+1,dp);
        dp[i][j]= Math.max(c1,c2);
        }
        return dp[i][j];
        
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
		     
	        int dp[][]=new int[n1][n2];
	        for(int [] r:dp)
	            Arrays.fill(r,-1);
		    System.out.println(LongestCommonSubsequence(s1,s2,n1,n2,0,0,dp));
		       
		}
	}
}