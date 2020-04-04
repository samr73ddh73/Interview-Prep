/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static int LongestCommonSubsequence(String s1,String s2,int n1,int n2,int i,int j)
    {
        if(i>=n1 || j>=n2 || s1==null || s2==null)
            return 0;
        if(s1.charAt(i)==s2.charAt(j))
            return 1+LongestCommonSubsequence(s1,s2,n1,n2,i+1,j+1);
        int c1=LongestCommonSubsequence(s1,s2,n1,n2,i+1,j);
        int c2=LongestCommonSubsequence(s1,s2,n1,n2,i,j+1);
        return Math.max(c1,c2);
        
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
		     
	
		    System.out.println(LongestCommonSubsequence(s1,s2,n1,n2,0,0));
		       
		}
	}
}