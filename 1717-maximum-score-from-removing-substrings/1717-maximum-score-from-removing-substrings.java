class Solution {
    String str;

    public int remove(String pair,int score){
        int total=0;
        Stack<Character> st = new Stack<>();

        char firstChar = pair.charAt(0);

        char secChar = pair.charAt(1);

        for(char ch: str.toCharArray()){
            if(ch==secChar && !st.isEmpty() && st.peek()==firstChar){
                total = total+score;
                st.pop();
            }else{
                st.push(ch);
            }
        }

        StringBuilder std = new StringBuilder();

        while(!st.isEmpty()){
            std.insert(0,st.pop());
        }
        str = std.toString();
        return total;
    }
    public int maximumGain(String s, int x, int y) {
     str=s;
     String firstPair = (x>y)?"ab":"ba";
     String secPair = (firstPair.equals("ab"))?"ba":"ab";
     int score=0;

     score= remove(firstPair,Math.max(x,y));
     score += remove(secPair,Math.min(x,y));


     return score;
    }
}