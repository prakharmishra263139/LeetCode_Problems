class Solution {
    public int nthUglyNumber(int n) {
        int countTwo=0;
        int countThree=0;
        int countFive=0;

        int dp[] =  new int[n+1];
        dp[0]=1;
        for(int i=1;i<=n;i++){
            dp[i] = Math.min(2*dp[countTwo],Math.min(3*dp[countThree],dp[countFive]*5));

            if(dp[i]==2*dp[countTwo]){
                countTwo++;
            }

            if(dp[i]==3*dp[countThree]){
                countThree++;
   
            }
            if(dp[i]==5*dp[countFive]){
                countFive++;
            }
        }
       return dp[n-1];
    }
}