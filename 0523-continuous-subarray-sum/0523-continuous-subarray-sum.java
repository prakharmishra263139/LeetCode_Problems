class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hash = new HashMap<>();
        hash.put(0,-1);
        int sum=0;
        for(int i=0;i<nums.length;i++){
          sum=sum+nums[i];
            if(hash.containsKey(sum%k)){
             int index = hash.get(sum%k);
                if(i-index>=2){
                 return true;
                }
            }else{
             hash.put(sum%k,i);
          }
        }
    return false;
    }
}