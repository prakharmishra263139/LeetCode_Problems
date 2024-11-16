class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
      int  minI =-1;
      int  maxI = -1;
      long ans=0;
      int left = -1;
      int n =nums.length;
      for(int current=0;current<n;current++){
        if(nums[current]==minK){
            minI = current;
        }
        if(nums[current]==maxK){
            maxI = current;
        }
        if(nums[current]<minK || nums[current]>maxK){
            left = current;
        }
        if(minI!=-1 && maxI  !=-1){
            int small = Math.min(minI,maxI);
            if((small-left)>0){
                ans = ans+(small-left);
            }
        }
      } 
return ans; 
    }
}