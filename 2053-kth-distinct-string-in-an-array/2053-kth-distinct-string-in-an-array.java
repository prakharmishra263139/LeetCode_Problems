class Solution {
    public String kthDistinct(String[] arr, int k) {
        int count=0;
        HashMap<String,Integer> mp =new HashMap<>();

        for(int i=0;i<arr.length;i++){
            mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
        }

        for(int i=0;i<arr.length;i++){
            if(mp.get(arr[i])==1){
                count++;
            }
            if(count==k){
                return arr[i];
            }
        }
        return "";


    }
}