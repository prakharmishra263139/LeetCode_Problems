class Solution {
    public int getLucky(String s, int k) {
        StringBuilder st = new StringBuilder();
        for(char ch : s.toCharArray()){
            st.append(ch-96);
        }

        while(k>0){
            int sum=0;
            for(int i=0;i<st.length();i++){
                sum = sum+(st.charAt(i)-'0');
            }
            k--;
            st = new StringBuilder(String.valueOf(sum));
        }

    return Integer.parseInt(st.toString());

    }
}