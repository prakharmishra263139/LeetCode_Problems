class Solution {
    public int increment(int[] nums) {

     int max  =  Integer.MIN_VALUE;
     for(int i=0;i<nums.length;i++){
        max = Math.max(nums[i],max);
     }   

     return max;
    }

    public int minIncrementForUnique(int nums[]){
        int maxEle = increment(nums);
        int n = nums.length;
        int count[] = new int[maxEle+n];

        for(int num:nums){
            count[num]++;
        }

        int moves=0;

        for(int i=0;i<count.length;i++){
            if(count[i]<=1){
                continue;
            }

            int extra  = count[i]-1;
            moves = moves+extra;
            count[i+1] += extra;
        }

        return moves;
    }
}