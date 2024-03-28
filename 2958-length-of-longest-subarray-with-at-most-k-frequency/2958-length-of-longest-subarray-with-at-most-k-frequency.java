class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        

        int start = 0;
        int end=0;
        int maxLen = 0;
        int n = nums.length;

        HashMap<Integer,Integer> mp = new HashMap<>();

        while(end<n){
            //include the element 
            mp.put(nums[end],mp.getOrDefault(nums[end],0)+1);

            while(mp.get(nums[end])>k){
               mp.put(nums[start],mp.get(nums[start])-1);
               start++;  
            }

            maxLen = Math.max(maxLen,end-start+1);
            end++;
        }

        return maxLen;

    }
}