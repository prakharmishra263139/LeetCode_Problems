class Solution {
    public int mostWordsFound(String[] sentences) {
        int count =1;

        for(String s:sentences){
            int words=1;
            for(int i=0;i!=s.length();i++){
                if(s.charAt(i)==' ')
                words++;
                count = Math.max(count,words);
            }
        }

        return count;
    }
}