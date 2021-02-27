class Knapsack 
{ 
    static Integer  knapsackHelper(int W, int wt[], int val[], int n,Integer dp[][])
    {
        if(n<0 || W<0)
            return 0;
        if(n==0 || W==0)
            return dp[n][W]=0;
        if(dp[n][W]!=null)
            return dp[n][W];
        if(wt[n-1]<=W)
            return dp[n][W]=Math.max(val[n-1]+knapsackHelper(W-wt[n-1],wt,val,n-1,dp),
        knapsackHelper(W,wt,val,n-1,dp));
        return knapsackHelper(W,wt,val,n-1,dp);
    }

    // Returns the maximum value that can be put in a knapsack of capacity W 
    static int knapSack(int W, int wt[], int val[], int n) 
    { 
       Integer dp[][]=new Integer[n+1][W+1];
        return knapsackHelper(W,wt,val,n,dp).intValue();
    } 
}
