class Solution {
    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> h = new HashSet<>();
        for(int num :nums){
            if(h.contains(num)){
                return true;
            }else{
                h.add(num);
            }
        }

        return false;
        
    }
}