
import java.util.*;
import java.lang.*;
import java.io.*;
class LCS
{
    StringBuilder str;
    int len;
    LCS(StringBuilder str,int len)
    {
        this.str=str;
        this.len=len;
    }
}
class GFG {
    static StringBuilder st=new StringBuilder("");
    public static int LongestCommonSubsequence(String s1,String s2,String s3,int n1,int n2,int n3,int i,int j,int k,int[][][] dp)
    {
        if(i>=n1 || j>=n2 ||k>=n3 || s1==null || s2==null)
            return 0;
        if(dp[i][j][k]!=-1)
            return dp[i][j][k];
        if(s1.charAt(i)==s2.charAt(j) && s1.charAt(i)==s3.charAt(k))
             dp[i][j][k]= 1+LongestCommonSubsequence(s1,s2,s3,n1,n2,n3,i+1,j+1,k+1,dp);
        else
        {int c1=LongestCommonSubsequence(s1,s2,s3,n1,n2,n3,i+1,j,k,dp);
        int c2=LongestCommonSubsequence(s1,s2,s3,n1,n2,n3,i,j+1,k,dp);
        int c3=LongestCommonSubsequence(s1,s2,s3,n1,n2,n3,i,j,k+1,dp);
        dp[i][j][k]= c1>(c2>c3?c2:c3)?c1:(c2>c3?c2:c3);
        }
        return dp[i][j][k];
        
    }
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int n1=Integer.parseInt(sc.next());
		    int n2=Integer.parseInt(sc.next());
		    int n3=Integer.parseInt(sc.next());
		    String s1=sc.next();
		    String s2=sc.next();
		    String s3=sc.next();
		     
	        int dp[][][]=new int[n1][n2][n3];
	        for(int [][] mat:dp)
	            for(int[] r:mat)
	                Arrays.fill(r,-1);
	        System.out.println(LongestCommonSubsequence(s1,s2,s3,n1,n2,n3,0,0,0,dp));
		       
		}
	}
}