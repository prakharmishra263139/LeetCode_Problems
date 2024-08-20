class Solution {

    private int[] prefixSum;
    private Integer[][] memo;
    private int n;

    public int stoneGameII(int[] piles) {
        n = piles.length;
        prefixSum = new int[n+1];
        memo = new Integer[n][n+1];

        for(int i=0;i<n;i++){
            prefixSum[i+1] = prefixSum[i]+piles[i];
        }  

        return DFS(0,1);
    }

    private int DFS(int i, int m){
        if(m*2 >= n-i){
            return prefixSum[n]-prefixSum[i];
        }

        if(memo[i][m] !=null){
            return memo[i][m];
        }

        int ans=0;

        for(int x=1;x<=m*2;++x){
            ans = Math.max(ans,prefixSum[n]-prefixSum[i]-DFS(i+x,Math.max(m,x)));
        }

        memo[i][m] = ans;

        return ans;
    }
}