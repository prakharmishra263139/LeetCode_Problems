class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int maj = nums[0];

        for(int num:nums){
            if(count==0){
                maj=num;
                count++;
            }else if(num==maj){
                count++;
            }else{
                count--;
            }
        }

        return maj;
        
    }
}