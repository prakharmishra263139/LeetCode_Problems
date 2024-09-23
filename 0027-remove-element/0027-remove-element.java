class Solution {
    public int removeElement(int[] nums, int val) {
        int index =0;
        int n = nums.length;
        while(index<n){
            if(nums[index] == val){
                nums[index] =nums[n-1];
                n--;
            } else{
                index++;
            }
        }
        return n;
}
}