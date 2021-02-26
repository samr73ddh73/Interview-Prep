
// https://leetcode.com/problems/partition-equal-subset-sum/submissions/
class Solution {
    public boolean canPartitionHandler(int[] nums,int targetSum,int n,Boolean dp[][]){
        if(n<0 || targetSum<0)
            return false;
        if(dp[n][targetSum]!=null)
            return dp[n][targetSum];
        if(nums[n]<=targetSum)
        return dp[n][targetSum]=canPartitionHandler(nums,targetSum-nums[n],n-1,dp) ||
            canPartitionHandler(nums,targetSum,n-1,dp);
        return dp[n][targetSum]=canPartitionHandler(nums,targetSum,n-1,dp);
        
    }
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i:nums)
            sum+=i;
        if((sum & 1)!=0)
            return false;
        int targetSum=sum/2;
        Boolean dp[][]=new Boolean[nums.length+1][targetSum+1];
        for(int i=0;i<dp.length;i++)
            dp[i][0]=true;
        for(int i=0;i<targetSum+1;i++)
            dp[0][i]=false;
        dp[0][0]=true;
        return canPartitionHandler(nums,targetSum,nums.length-1,dp);
    }
    
}
