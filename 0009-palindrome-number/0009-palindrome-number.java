class Solution {
    public boolean isPalindrome(int x) {

        if(x<0 || (x!=0 && x%10==0)) return false;

        int dig=0;
        while(x>dig){
            dig = dig*10+x%10;
            x = x/10;
        }

        return (x == dig || x==dig/10);
        
    }
}