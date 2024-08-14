class Solution {
    public int smallestDistancePair(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int low=0;
        int high=nums[n-1]-nums[0];

        while(low<high){
            int mid=low+(high-low)/2;
            if(count(nums,mid)<k){
                low=mid+1;
            }else{
                high=mid;
            }
        }

        return low;
    }

    public int count(int nums[], int maxdist){
        int count=0;
        int j=0;
        for(int i=0;i<nums.length;++i){
            while(j<nums.length && nums[j]-nums[i]<=maxdist){
                ++j;
            }

            count += j-i-1;
        }

        return count;

    }
}