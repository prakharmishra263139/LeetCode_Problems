class Solution {
    public int minSwaps(int[] nums) {
        int windowSize=0;
        for(int num:nums){
            windowSize +=num;
        }

        int zero=0;

        for(int i=0;i<windowSize;i++){
            if(nums[i]==0){
               zero++; 
            }
        }

        int min=zero;
        int start=0;
        int end=windowSize-1;
        int n=nums.length;

        while(start<n){
            if(nums[start]==0){
                zero--;
            }

            start++;
            end++;
            if(nums[end%n]==0){
                zero++;
            }
            min = Math.min(min,zero);
        }

        return min;
    }
}