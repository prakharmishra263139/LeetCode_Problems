class Solution {
    public int maxProduct(int[] nums) {

        int n  = nums.length;

        int preM = 1;
        int sufM =1;
        int ans = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(preM ==0) preM=1;

            if(sufM == 0) sufM=1;

            preM = preM*nums[i];

            sufM = sufM*nums[n-i-1];

            ans  = Math.max(ans,Math.max(preM,sufM));

        }
        return ans;
    }
}