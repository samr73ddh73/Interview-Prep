//O(n1*n2^2)

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static int LongestCommonSubstring(String s1,String s2,int n1,int n2)
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n1;i++)
        {
            
            for(int j=0;j<n2;j++)
            {
                int ind1=i,ind2=j,c=0;
                while(ind1<n1 && ind2<n2 && s1.charAt(ind1)==s2.charAt(ind2))
                {
                    ind1++;
                    ind2++;
                    c++;
                }
                max=Math.max(c,max);
                
                
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