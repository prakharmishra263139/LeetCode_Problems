class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        HashMap<Integer,Integer> mp = new HashMap<>();

        for(int i:nums){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }

        int count =0;

        for(int i:nums){
            if(mp.containsKey(i+diff) &&mp.containsKey(i+diff+diff)){
                count++;
            }
        }

        return count;
    }
}