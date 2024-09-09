class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        HashSet<Integer> st  =new HashSet<>();

        for(int i=nums.length-1;i>=0;i--){
            st.add(nums[i]);

            if(st.size()==3){
                return nums[i];
            }
        }

        return nums[nums.length-1];
        
    }
}