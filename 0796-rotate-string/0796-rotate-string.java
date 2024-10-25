class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){ 
            return false;
        }
    String string = s+s;
return (string.contains(goal));
    }
}