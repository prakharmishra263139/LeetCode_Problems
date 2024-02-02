class Solution {
    public String longestPrefix(String s) {
        
        String ans ="";
        for(int i=s.length()-1;i>=0;i--){
            String st = s.substring(0,i);
            if(s.endsWith(st)){
                ans += st;
                break;
            }
        }

        return ans;
    }
}