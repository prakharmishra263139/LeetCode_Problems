class Solution {
    public long countSubarrays(int[] nums, int k) {
        
        int n = nums.length;

        int maxEle = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            maxEle= Math.max(maxEle,nums[i]);
        }

        int start=0;
        int end =0;
        long count=0;

        int freqCount=0;

        while(end<n){
            if(nums[end]==maxEle){
              freqCount++;    
            }

            while(freqCount ==k){
                count =count+(n-end);
                if(nums[start]==maxEle){
                    freqCount--;
                }
                start++;
            }

            end++;;
        }

        return count;
    }
}