class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int array[] =new int[n];
        for(int i=0;i<n;i++){
            int number = nums[i];
            array[i] = number*number;
        }
    Arrays.sort(array);
return array;
    }
}