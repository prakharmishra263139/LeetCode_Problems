class Solution {
    public long maximumImportance(int n, int[][] roads) {
        
        long conections []  = new long[n];

        for(int conect[]:roads){
            conections[conect[0]]++;
            conections[conect[1]]++;
        }

        Arrays.sort(conections);
        long ans=0;
        long mark=1;

        for(int i=0;i<n;i++){
            ans = ans+(conections[i]*mark);
            mark++;
        }

        return ans;
    }
}