class Solution {
    public int findCenter(int[][] edges) {
        int n =edges.length+1;
        

        int freq[]=new int[n+1];

        for(int i=0;i<edges.length;i++){
            for(int j=0;j<2;j++){
                freq[edges[i][j]]++;
            }
        }

        int cent=0;
        for(int i=1;i<=n;i++){
            if(freq[i]==n-1){
                cent=i;
                break;
            }
        }

        return cent;
    }
}