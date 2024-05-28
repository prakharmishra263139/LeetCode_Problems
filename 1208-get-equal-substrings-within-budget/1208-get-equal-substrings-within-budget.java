class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int n=s.length();
        int start=0;
        int cost=0;
        int len=0;

        for(int end=0;end<n;end++){
            cost += Math.abs(s.charAt(end)-t.charAt(end));

            while(cost>maxCost){
                cost -= Math.abs(s.charAt(start)-t.charAt(start));
                ++start;
            }

            len =Math.max(len,end-start+1);
        }

        return len;
    }
}