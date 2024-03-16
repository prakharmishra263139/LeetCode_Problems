class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        mp.put(0,-1);
        int maxLen = 0;
        int sum = 0;

        int n  = nums.length;

        for(int i=0;i<n;i++){
            sum = sum+((nums[i]==0) ? -1:1);
            if(mp.containsKey(sum)){
                int len = i-mp.get(sum);
                maxLen = Math.max(maxLen,len);
            }else{
                mp.put(sum,i);
            }
        }
return maxLen;
    }
}