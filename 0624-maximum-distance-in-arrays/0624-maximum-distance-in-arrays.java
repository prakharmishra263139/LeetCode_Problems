class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int min = arrays.get(0).get(0);
        int max = arrays.get(0).getLast();
        int ans=0;

        for(int i=1;i<arrays.size();i++){
            List<Integer> list  = arrays.get(i);
            int curMin = list.get(0);
            int curMax = list.getLast();

            ans  = Math.max(ans,Math.abs(curMax-min));
            ans = Math.max(ans,Math.abs(max-curMin));

            min = Math.min(min,curMin);
            max = Math.max(max,curMax);

        }

        return ans;
        
    }
}