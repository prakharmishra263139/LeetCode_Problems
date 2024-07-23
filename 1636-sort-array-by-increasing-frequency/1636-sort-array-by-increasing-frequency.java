class Solution {
    public int[] frequencySort(int[] nums) {
        int n = nums.length;

        HashMap<Integer,Integer> mp = new HashMap<>();

        for(int num : nums){
            mp.put(num,mp.getOrDefault(num,0)+1);
        }

        Integer temp[]= new Integer[n];

        for(int i=0;i<n;i++){
            temp[i]=nums[i];
        }

        Arrays.sort(temp,new Comparator<Integer>(){
            public int compare(Integer a, Integer b){
                if(mp.get(a)==mp.get(b)){
                    return b-a;
                }

                return mp.get(a)-mp.get(b);
            }

        });

        for(int i=0;i<n;i++){
            nums[i]=temp[i];
        }

        return nums;


    }
}