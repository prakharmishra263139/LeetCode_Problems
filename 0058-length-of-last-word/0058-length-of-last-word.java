class Solution {
    public int lengthOfLastWord(String s) {
        
        int len =0;
        int i= s.length()-1;

        while(i>=0){
            if(s.charAt(i)==' '){
                if(len==0){
                    i--;
                }else{
                    break;
                }
            }else{
                len++;
                i--;
            }
        }

        return len;
    }
}