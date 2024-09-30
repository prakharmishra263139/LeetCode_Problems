class Solution {
    public int climbStairs(int n) {

        int dp[] =new int[n+1];
        Arrays.fill(dp,-1);
        return helpers(n,dp);
        
    }

    private int helpers(int n,int[]dp){
        if(n<0) {
          return 0;
        }

        if(n==0) {
            return 1;
        }

        if(dp[n]!=-1) {
            return dp[n];
        }

        dp[n] = helpers(n-1,dp)+helpers(n-2,dp);

        return dp[n];
    }
}