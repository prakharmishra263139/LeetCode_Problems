class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return countOfSubarrayWithAtMost(nums,k) - countOfSubarrayWithAtMost(nums,k-1);
        
    }


    public int countOfSubarrayWithAtMost(int nums[] ,int k){
        HashMap<Integer,Integer> mp=new HashMap<>();
        int start=0;
        int end=0;
        int count=0;
        int n = nums.length;

        while(end<n){
            mp.put(nums[end],mp.getOrDefault(nums[end],0)+1);

            while(mp.size()>k){
              mp.put(nums[start],mp.get(nums[start])-1);  

              if(mp.get(nums[start])==0){
                mp.remove(nums[start]);
              }

              start++;

            }

            count = count+(end-start+1);
            end++;
        }

        return count;
    }
}