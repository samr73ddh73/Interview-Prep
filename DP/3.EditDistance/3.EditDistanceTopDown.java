/*package whatever //do not write package name here */

import java.util.*;


class Main {
    public static int editDistance(String s1,String s2,int n,int m,int i,int j,int [][]dp)
    {
        // if(j>=m && i<n)
        //     return n-1-i;
        if(i==s1.length())
            return s2.length()-j;
        if(j==s2.length())
            return s1.length()-i;
        if(i<0 || i>=n || j<0 || j>=m)
            return 0;
        if(dp[i][j]!=-1)
            return dp[i][j];
        if(s1.charAt(i)==s2.charAt(j))
            dp[i][j]= editDistance(s1,s2,n,m,i+1,j+1,dp);
        else
        {
        int c1=1+editDistance(s1,s2,n,m,i,j+1,dp);
        int c2=1+editDistance(s1,s2,n,m,i+1,j,dp);
        int c3=1+editDistance(s1,s2,n,m,i+1,j+1,dp);
        dp[i][j]= c1>(c2>c3?c3:c2)?(c2>c3?c3:c2):c1;
        }
        return dp[i][j];
        
    }
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int t=Integer.parseInt(sc.nextLine());
		while(t-->0)
		{
		    int n=Integer.parseInt(sc.next());
		    int m=Integer.parseInt(sc.next());
		    String s1=sc.next();
		    String s2=sc.next();
		    int dp[][]=new int[n][m];
		    for(int[] row: dp)
		        Arrays.fill(row,-1);
		    
		    System.out.println(editDistance(s1,s2,n,m,0,0,dp));
		}
	}
}