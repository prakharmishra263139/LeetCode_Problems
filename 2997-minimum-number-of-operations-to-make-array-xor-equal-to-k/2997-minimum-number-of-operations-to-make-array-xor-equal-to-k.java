class Solution {
    public int minOperations(int[] nums, int k) {
        
        int count=0;
        int xor=0;
        for(int i=0;i<nums.length;i++){
            xor = xor^nums[i];
        }
        while(k>0 || xor>0){
            if(k%2!=xor%2){
                count++;
            }
            k = k/2;
            xor = xor/2;
        }
        return count;
    }
}