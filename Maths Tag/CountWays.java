//Count ways to express a number as sum of consecutive numbers


import java.util.*;
import java.lang.*;
import java.io.*;

class CountWays {
    public static int bruteForce(int n)
    {
        int c=0;
        for(int i=1;i<n;i++)
		    {
		        int sum=i;
		        for(int j=i+1;j<n;j++)
		        {
		              
		            sum+=j;
		            if(sum==n)
		            {
		                c++;
		                break;
		            }
		            if(sum>n)
		                break;
		                
		        }
		    }
        return c;
    }
    public static int Optimized(int N)
    {
        
        int cnt=0;
        
        for(int L=1; L*(L+1) < 2*N; L++)
        {
            double a = (double) ((1.0*N - L*(L+1)/2)/ (double) (L+1));
            if(a - (int) a == 0.0)
                cnt++;
        }
        
        return cnt;
	    
	    
	}

	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int c1= bruteForce(n);
            int c2=Optimized(n);
		    System.out.println(c1);
             System.out.println(c2);
		}
	}
}

// Java program to check if any Subarray of size 
// K has a given Sum 

class GFG{ 
// Function to check if any Subarray of size K 
// has a given Sum 
static boolean checkSubarraySum(int[] arr, int n, 
					int k, int sum) 
{ 
	// Check for first window 
	int curr_sum = 0; 
	for (int i=0; i<k; i++) 
	curr_sum += arr[i]; 
	if (curr_sum == sum) 
		return true; 

	// Consider remaining blocks ending with j 
	for (int j = k; j < n; j++) { 
		curr_sum = curr_sum + arr[j] - arr[j-k]; 
		if (curr_sum == sum) 
			return true;	 
	} 
	return false; 
} 

// Driver code 
public static void main(String[] args) 
{ 
	int[] arr=new int[]{ 1, 4, 2, 10, -2, 2, 1, 0, 20 }; 
	int k = 4; 
	int sum = 12; 

	int n = arr.length; 

	if (checkSubarraySum(arr, n, k, sum)) 
		System.out.println("YES"); 
	else
		System.out.println("NO"); 

} 
} 
// This code is contributed by mits 
