class Solution {
    public int maxFrequencyElements(int[] nums) {

        HashMap<Integer,Integer> mp =new HashMap<>();

        for(int num : nums){
            mp.put(num,mp.getOrDefault(num,0)+1);
        }

        int max = 0;

        for(int x :mp.values()){
            max = Math.max(max,x);
        }

        int count =0;

        for(int x:mp.values()){
            if(max ==x ){
                count = count+x;
            }
        }

        return count;   
    }
}