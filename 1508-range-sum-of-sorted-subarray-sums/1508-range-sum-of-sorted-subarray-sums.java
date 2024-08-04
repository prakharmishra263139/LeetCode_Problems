class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<n;i++){
            int prefixSum=0;
            for(int j=i;j<n;j++){
                prefixSum=prefixSum+nums[j];
                list.add(prefixSum);
            }
        }
        Collections.sort(list);
        int ans=0;
        int mod =1000000007;;

        for(int i=left-1;i<right;i++){
            ans=(ans+list.get(i))%mod;
        }
        return ans;


    }
}