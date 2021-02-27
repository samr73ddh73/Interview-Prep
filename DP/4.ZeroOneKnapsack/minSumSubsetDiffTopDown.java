class Solution
{
    int minDiff=Integer.MAX_VALUE;
    public int minDiff(int arr[], int n, int sum, int sum1,int dp[][]) {
        if(n<0)
            return minDiff;
        if(n==0)
            return dp[n][sum1]=minDiff;
        if(dp[n][sum1]!=-1)
            return dp[n][sum1];
        int currDiff=Math.abs((sum-sum1)-sum1);
        minDiff=Math.min(currDiff,minDiff);
        if(arr[n-1]<=sum)
            return dp[n][sum1]=Math.min(minDiff(arr,n-1,sum,sum1+arr[n-1],dp),minDiff(arr,n-1,sum,sum1,dp));
        return dp[n][sum1]=minDiff(arr,n-1,sum,sum1,dp);
        
    }
	public int minDiffernce(int arr[], int n) 
	{ 
	    // Your code goes here
	     int sum=0;
	     for(int i:arr)
	        sum+=i;
	     int dp[][]=new int[n+1][sum+1]; //sum: let sum of subset1
	    for(int i=0;i<n+1;i++)
            for(int j=0;j<sum+1;j++)
                dp[i][j]=-1;
	     //init: n<=1=>Max value
	     return minDiff(arr,n,sum,0,dp);
	} 
}
