class Solution
{
    int minDiff=Integer.MAX_VALUE;
    public int minDiff(int arr[], int n, int sum, int sum1) {
        if(n<=0)
            return minDiff;
        int currDiff=Math.abs((sum-sum1)-sum1);
        minDiff=Math.min(currDiff,minDiff);
        if(arr[n-1]<=sum)
            return Math.min(minDiff(arr,n-1,sum,sum1+arr[n-1]),minDiff(arr,n-1,sum,sum1));
        return minDiff(arr,n-1,sum,sum1);
        
    }
	public int minDiffernce(int arr[], int n) 
	{ 
	    // Your code goes here
	     int sum=0;
	     for(int i:arr)
	        sum+=i;
	     int dp[][]=new int[n+1][sum+1]; //sum: let sum of subset1
	     //init: n<=1=>Max value
	     return minDiff(arr,n,sum,0);
	} 
}
