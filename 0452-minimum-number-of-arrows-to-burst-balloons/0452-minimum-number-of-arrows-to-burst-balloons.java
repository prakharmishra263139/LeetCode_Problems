class Solution {
    public int findMinArrowShots(int[][] points) {
        
        int n = points.length;
        if(n==1) return 1;

        Arrays.sort(points,new Comparator<int[]>(){
            public int compare(int a1[], int a2[]){
                if(a1[1]==a2[1]) return 0;

                if(a1[1]<a2[1]) return -1;

                return 1;
            }
        });

        int arrows =1;
        int commonEndPoint = points[0][1];

        for(int i=1;i<n;i++){
            int curS = points[i][0];
            int curE = points[i][1];

          if(curS>commonEndPoint){
            commonEndPoint =curE;
            arrows++;
        }
    }
        return arrows;
    }
}