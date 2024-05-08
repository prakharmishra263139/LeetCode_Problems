class Solution {

    public int findMax(int score[]){
        int max = Integer.MIN_VALUE;
        for(int element:score){
            max = Math.max(max,element);
        }

        return max;
    }
    public String[] findRelativeRanks(int[] score) {
       int maxVal = findMax(score);
       int n=score.length;
       int map[] = new int[maxVal+1]; 

       for(int i =0;i<score.length;i++){
         map[score[i]]=i+1;
       }

       int rank=1;

       String res [] = new String[n];
       for(int i=maxVal;i>=0;i--){
            if(map[i]!=0){
                int original =map[i]-1;
                if(rank==1){
                    res[original] = "Gold Medal";
                }else if(rank==2){
                    res[original] = "Silver Medal";
                }else if(rank==3){
                    res[original] = "Bronze Medal";
                }else{
                    res[original]=Integer.toString(rank);
                }

                rank++;
               }

               if(rank>n){
                break;
               }
       }

       return res;
    }
}