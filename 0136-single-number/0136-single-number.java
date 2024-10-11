class Solution {
    public int singleNumber(int[] nums) {
    
        int n = nums.length;
        HashMap<Integer,Integer> mp =new HashMap<>();
        for(int i=0;i<n;i++){
            int val = mp.getOrDefault(nums[i],0);
            mp.put(nums[i],val+1);
        }
        for(Map.Entry<Integer,Integer> it : mp.entrySet()){
            if(it.getValue()==1){
                return it.getKey();
            }
        }

        return -1;
    }
}