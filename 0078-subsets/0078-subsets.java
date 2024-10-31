class Solution {

    public void subset(int nums[], ArrayList<Integer>temp,int index){
        if(index>=nums.length){
            list.add(new ArrayList<>(temp));
            return;
        } 
        temp.add(nums[index]);
        subset(nums,temp,index+1);
        temp.remove(temp.size()-1);
        subset(nums,temp,index+1);
    }

     List<List<Integer>>list =new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {

       
        if(nums==null || nums.length==0) return list;

        subset(nums,new ArrayList<Integer>(),0);
        return list;
        
    } 
}