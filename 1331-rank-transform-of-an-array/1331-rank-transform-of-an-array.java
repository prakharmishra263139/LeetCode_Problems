class Solution {
    public int[] arrayRankTransform(int[] arr) {
      int n = arr.length;

      int temp[] = new int[n];

      for(int i=0;i<n;i++){
        temp[i]=arr[i];
      }  

      Arrays.sort(temp);

      int index=1;

      HashMap<Integer,Integer> mp= new HashMap<>();

      for(int i=0;i<n;i++){

        if(!mp.containsKey(temp[i])){
          mp.put(temp[i],index);
          index++;
        }
      }

      int ans[] = new int[n];

      for(int i=0;i<n;i++){
        ans[i] = mp.get(arr[i]);
      }

      return ans;
    }
}