class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        
        int start=0;
        int end=0;
        int oddCount=0;
        int count=0;
        int temp=0;
        
        while(end<nums.length){
            if(nums[end]%2==1){
                oddCount++;
                temp=0;
            }
            while(oddCount==k){
                temp++;
                if(nums[start]%2==1){
                    oddCount--;
                }
                start++;
            }
            count=count+temp;
            end++;
        }

        return count;
    }
}