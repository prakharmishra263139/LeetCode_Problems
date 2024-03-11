class Solution {
    public String customSortString(String order, String s) {
        

        HashMap<Character,Integer> mp  = new HashMap<>();

        for(char i : s.toCharArray()){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }

        StringBuilder st =new StringBuilder();

        for(char i : order.toCharArray()){
            if(mp.containsKey(i)){
                for(int j=0;j<mp.get(i);j++){
                    st.append(i);
                }
                mp.put(i,0);
            }
        }

        for(Map.Entry<Character,Integer> entry : mp.entrySet()){
            char key = entry.getKey();
            int val  =entry.getValue();

            if(val !=0){
                for(int j=0;j<val;j++){
                    st.append(key);
                }
            }
        }

        return st.toString();
    }
}