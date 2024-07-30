class Solution {
    public int minimumDeletions(String s) {
        int bCount=0;
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            if(ch=='b'){
                bCount++;
            }

            if(bCount>0 && ch=='a'){
                bCount--;
                count++;
            }
        }

        return count;
    }
}