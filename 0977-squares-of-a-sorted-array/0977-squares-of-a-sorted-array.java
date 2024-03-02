class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;

        int nArr[] =new int[n];
        
        for(int i=0;i<n;i++){
            int num = nums[i];
            nArr[i] = num*num;
        }
        Arrays.sort(nArr);
        return nArr;
    }
}