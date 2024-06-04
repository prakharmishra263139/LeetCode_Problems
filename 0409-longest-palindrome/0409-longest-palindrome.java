class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> mp = new HashMap<>();
        int res=0;
        int oddCount=0;

        for(char ch:s.toCharArray()){
            mp.put(ch,mp.getOrDefault(ch,0)+1);

            int currFreq = mp.get(ch);
            if(currFreq%2==0){
                res = res+2;
                oddCount--;
            }else{
                oddCount++;
            }
        }

        if(oddCount>0){
            res = res+1;
        }

        return res;
    }
}