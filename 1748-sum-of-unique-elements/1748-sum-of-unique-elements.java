class Solution {
    public int sumOfUnique(int[] nums) {
        

        HashMap<Integer,Integer> mp =new HashMap<>();
        int sum=0;
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);

            if(mp.get(nums[i])==1){
                sum = sum+nums[i];
            }

            if(mp.get(nums[i])==2){
                sum = sum-nums[i];
            }
        }

        return sum;
    }
}