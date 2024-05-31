class Solution {
    public int[] singleNumber(int[] nums) {
        
        Set<Integer> st =new HashSet<>();
        for(int num :nums){
            if(st.contains(num)){
                st.remove(num);
            }else{
                st.add(num);
            }
        }

        int ans[]=new int[2];

        int index=0;

        for(int num :st){
            ans[index++]=num;
        }

        return ans;

    }
}