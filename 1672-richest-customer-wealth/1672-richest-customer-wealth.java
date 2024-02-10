class Solution {
    public int maximumWealth(int[][] accounts) {
        int max  =accounts[0][0];

        for(int cust[]:accounts){
            int sum = 0;
            for(int cal :cust){

                sum = sum+cal;
                max = Math.max(max,sum);
            }
        }

        return max;
    }
}