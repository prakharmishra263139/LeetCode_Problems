class Solution {
    public int[] rearrangeArray(int[] nums) {

        int n = nums.length;

        int arr[] =new int[n];

        int p=0;
        int neg=1;


        for(int i=0;i<n;i++){
            if(nums[i]>0){
                arr[p]=nums[i];
                p = p+2;
            }else{
                arr[neg]=nums[i];
                neg = neg+2;
            }
        }

        return arr;
        
    }
}