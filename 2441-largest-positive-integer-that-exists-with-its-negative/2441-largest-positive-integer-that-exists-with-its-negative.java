class Solution {
    public int findMaxK(int[] nums) {
       
       HashSet<Integer> st = new HashSet<>();

        int max=-1;

        for(int ele :nums){
            if(Math.abs(ele)>max){
                if(st.contains(-ele)){
                    max = Math.abs(ele);
                }else{
                    st.add(ele);
                }
            }
        }

        return max; 
    }
}