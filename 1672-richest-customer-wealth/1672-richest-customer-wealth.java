class Solution {
    public int maximumWealth(int[][] accounts) {
        int answer  = accounts[0][0];
        for(int customer[]:accounts){
            int res = 0;
            for(int cal :customer){
                res = res+cal;
                answer = Math.max(answer,res);
            }
        }
        return answer;
    }
}