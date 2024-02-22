class Solution {
    public int findJudge(int n, int[][] trust) {

        if(trust.length <n-1){
            return -1;
        }
        int [] in = new int[n+1];
        int [] out  = new int[n+1];

        for(int [] arr: trust){
            out[arr[0]]++;
            in[arr[1]]++;
        }

        for(int i=1;i<=n;i++){
            if(in[i]==n-1 && out[i]==0){
                return i;
            }
        }

        return -1;
    }
}