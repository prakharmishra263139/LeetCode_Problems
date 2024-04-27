class Solution {
    public int findRotateSteps(String ring, String key) {


        int dp[][]= new int[key.length()][ring.length()];

        for(int i=0;i<key.length();i++){
            Arrays.fill(dp[i],-1);
        }
      ArrayList<Integer> posArr[] =new ArrayList[26];
      for(int i=0;i<ring.length();i++){
        char ch  = ring.charAt(i);
        int index = ch-97;
        if(posArr[index]==null){
            posArr[index]= new ArrayList<Integer>();
        }
        posArr[index].add(i);
      }  

      int min = getMinStep(key,ring,0,0,posArr,dp);
      return min;
    }

    public int getMinStep(String key,String ring,int ringIndex,int keyIndex,ArrayList<Integer>posArr[],int dp[][]){
        if(keyIndex==key.length()){
            return 0;
        }

        if(dp[keyIndex][ringIndex]!=-1){
            return dp[keyIndex][ringIndex];
        }

        int charIndex = key.charAt(keyIndex)-97;
        ArrayList<Integer> pos = posArr[charIndex];
        int minAns = Integer.MAX_VALUE;
        for(int po : pos){
            int clock = Math.abs(ringIndex - po);
            int anti = ring.length()-clock;

            int minStep = Math.min(clock,anti);

            int currAns = minStep + getMinStep(key,ring,po,keyIndex+1,posArr,dp);

            minAns = Math.min(minAns,currAns);
        
        }

        return dp[keyIndex][ringIndex] = 1+minAns;


    }


}