class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        HashSet<Integer> st = new HashSet<>();

        HashSet<Integer> mp = new HashSet<>();

        for(int i=0;i<nums1.length;i++){
            st.add(nums1[i]);
        }

        for(int i=0;i<nums2.length;i++){
            if(st.contains(nums2[i])){
                mp.add(nums2[i]);
            }
        }

        int ans[] = new int [mp.size()];

        int k =0;

        for(int n:mp){
            ans[k++] = n;
        }
return ans;
        
        
    }
}