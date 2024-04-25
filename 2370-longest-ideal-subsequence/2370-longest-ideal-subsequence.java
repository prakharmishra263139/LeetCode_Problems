class Solution {
    public int longestIdealString(String s, int k) {
        int n = s.length();
        int dp[]= new int[26];

        int len=0;

        for(int i=0;i<n;i++){
            char current = s.charAt(i);
            int index=current-'a';
            int wind=0;

            for(int prev= 0;prev<26;prev++){
                if(Math.abs(index-prev)<=k){
                    wind = Math.max(wind,dp[prev]);
                }
            }

            dp[index]=wind+1;
            len = Math.max(len,dp[index]);
        }

        return len;
    }
}