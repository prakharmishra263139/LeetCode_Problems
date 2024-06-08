class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        mp.put(0,-1);
        int sum=0;

        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            if(mp.containsKey(sum%k)){
                int index = mp.get(sum%k);
                if(i-index>=2){
                    return true;
                }
            }else{
                mp.put(sum%k,i);
            }
        }

        return false;
    }
}