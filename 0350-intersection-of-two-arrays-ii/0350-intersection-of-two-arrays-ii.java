class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int n = nums1.length;
        HashMap<Integer,Integer> mp = new HashMap<>();

        List<Integer> list = new ArrayList<>();

        for(int num:nums1){
            mp.put(num,mp.getOrDefault(num,0)+1);
        }

        for(int num:nums2){
            if(mp.containsKey(num) && mp.get(num)>0){
                list.add(num);
                mp.put(num,mp.get(num)-1);
            }
        }

        int ans[]  = new int[list.size()];

        for(int i=0;i<list.size();i++){
            ans[i]=list.get(i);
        }

        return ans;
       
    }
}