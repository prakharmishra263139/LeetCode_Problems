class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        

        HashSet<Integer>mp = new HashSet<>();

        for(int i=0;i<nums1.length;i++){
            mp.add(nums1[i]);
        }
        
        for(int i=0;i<nums2.length;i++){
            if(mp.contains(nums2[i])){
                return nums2[i];
            }else{
                continue;
            }
        }
return -1;
    }
}