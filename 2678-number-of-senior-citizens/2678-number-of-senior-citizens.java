class Solution {
    public int countSeniors(String[] details) {
        int  n = details.length;
        int str =0;
        int count=0;
        for(int i=0;i<n;i++){
            String s = details[i].substring(11,13);
            str = Integer.parseInt(s);

            if(str>60){
                count++;
            }
        }

        return count;
    }
}