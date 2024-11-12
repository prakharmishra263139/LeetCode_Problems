class Solution {
    public int rob(int[] nums) {
        int n =nums.length;
        int dp[]= new int[n];
        Arrays.fill(dp,-1);
    return helper(n-1,nums,dp);
    }

    public static int helper(int i, int arr[],int dp[]){
        if(i<0) return 0;
        if(i==0) return arr[i];
        if(dp[i]!=-1){
            return dp[i];
        }
        int pick = arr[i]+helper(i-2,arr,dp);
        int nonPick = helper(i-1,arr,dp);
return dp[i]=Math.max(pick,nonPick);
    }
}