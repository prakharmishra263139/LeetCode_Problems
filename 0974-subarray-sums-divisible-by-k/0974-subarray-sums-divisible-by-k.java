class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> mp=  new HashMap<>();
        mp.put(0,1);
        int n =nums.length;
        int sum=0;
        int ans=0;
        for(int i=0;i<n;i++){
            sum = sum+nums[i];

            int temp = sum%k;

            if(temp%k<0){
                temp= temp + k;
            }
            if(mp.containsKey(temp)){
                ans = ans+ mp.get(temp);
            }
        mp.put(temp,mp.getOrDefault(temp,0)+1);
        }

        return ans;
    }
}