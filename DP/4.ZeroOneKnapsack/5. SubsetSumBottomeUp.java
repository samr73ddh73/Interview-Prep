class Solution{
    static int equalPartition(int N, int arr[])
    {
        int sum=0;
        for(int i:arr)
            sum+=i;
        if((sum&1)!=0)
            return 0;
        sum=sum/2;
        int dp[][]=new int[N+1][sum+1];
        for(int i=0;i<N+1;i++)
            dp[i][0]=1;
        for(int i=0;i<sum+1;i++)
            dp[0][i]=0;
        dp[0][0]=1;
        for(int i=1;i<N+1;i++){
            for(int j=1;j<sum+1;j++){
                if(arr[i-1]<=j)
                    dp[i][j]=dp[i-1][j-arr[i-1]] | dp[i-1][j];
                else
                    dp[i][j]=dp[i-1][j];
            }
        }
        return dp[N][sum];
    }
}
