class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        
        int n =  tokens.length;

        Arrays.sort(tokens);

        int maxScore=0;
        int score=0;

        int i=0;
        int j = n-1;

        while(i<=j){
            if(power>=tokens[i]){
                power -= tokens[i++];
                maxScore = Math.max(maxScore,++score);
            }else if(score>0){
                score--;
                power += tokens[j--];
            }else{
                break;
            }
        }

        return maxScore;
    }
}