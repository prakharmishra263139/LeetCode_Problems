class Solution {
    public int minSteps(int n) {
        if(n==1) return 0;

        return 1+helper(n,1,1);
    }

    public int helper(int n,int current , int copy){
        if(current==n){
            return 0;
        }

        int paste=2000;

        if(current+copy<=n){
            paste = 1+helper(n,current+copy,copy);
        }

        int copypaste=2000;
        if(current*2<=n){
            copypaste = 2+helper(n,current*2,current);
        }
        return Math.min(copypaste,paste);
    }
}