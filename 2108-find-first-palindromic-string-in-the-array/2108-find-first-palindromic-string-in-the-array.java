class Solution {
    public String firstPalindrome(String[] words) {
            for(String st : words){
                if(checkPal(st)){
                    return st;
                }
            }
            return "";    
    }

    private static boolean checkPal(String s){
            int i = 0;
            int j = s.length()-1;

            while(i<j){
                if(s.charAt(i) != s.charAt(j)){
                    return false;
                }
                i++;
                j--;
            }

            return true;
    }
}