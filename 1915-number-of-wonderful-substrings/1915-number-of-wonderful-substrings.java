class Solution {
    public long wonderfulSubstrings(String word) {
        int[]count=new int[1024];
        count[0]=1;
        long res=0;
        int xor=0;
        for(int i=0; i<word.length(); i++){
            xor^=1<<(word.charAt(i)-'a');
            res+=count[xor];
            for(int j=0; j<10; j++){
                res+=count[xor^(1<<j)];
            }
            count[xor]++;
        }
        return res;

    }
}