class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
      Arrays.sort(happiness);
      int n = happiness.length;
      int turn=0;
      long sum=0;

      for(int i=n-1;i>=0;i--){
        sum  =sum+Math.max(happiness[i]-turn,0);
        turn++;

        if(turn>=k){
            break;
        }
      }  

      return sum;
    }
}