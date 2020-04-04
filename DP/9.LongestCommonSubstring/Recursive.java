/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static int LongestCommonSubstring(String s1,String s2,int n1,int n2,int i,int j,int res)
    {
       if(i>=n1 || j>=n2)
            return res;
            
        if(s1.charAt(i)==s2.charAt(j))
            return LongestCommonSubstring(s1,s2,n1,n2,i+1,j+1,res+1);
        else
        {
            return Math.max(LongestCommonSubstring(s1,s2,n1,n2,i+1,j,0),LongestCommonSubstring(s1,s2,n1,n2,i,j+1,0));
        }
        
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
		     
	       // int dp[][]=new int[n1][n2];
		    System.out.println(LongestCommonSubstring(s1,s2,n1,n2,0,0,0));
		       
		}
	}
}


/*package whatever //do not write package name here */

