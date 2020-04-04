/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static int NthStair(int arr[],int n,int i)
    {
       if(i>=n)
         return 0;
    //    for(int j=1;j<=arr[i];j++)
    //       return 1+NthStair(arr,n,i+j);
        while(arr[i]>=0)
        {   
            arr[i]=arr[i]-1;
            return 1+NthStair(arr, n, i);
        }
    }
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println(NthStair(arr,0,n));
	}
}




