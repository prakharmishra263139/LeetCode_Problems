class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {

     int n  =nums.length;

     HashMap<Integer,Integer> mp =new HashMap<>();
     int preSum=0;
     int count =0;


     mp.put(0,1);

     for(int i=0;i<n;i++){
        preSum = preSum+nums[i];

        int rem = preSum-goal;

        count   = count +mp.getOrDefault(rem,0);

        mp.put(preSum,mp.getOrDefault(preSum,0)+1);

     }
        return count;

    }
}