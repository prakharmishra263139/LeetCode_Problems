class Solution {
    public List<String> commonChars(String[] words) {
        int csf[] = new int[26];
        String first = words[0];
        for(char ch : first.toCharArray()){
            int index = ch - 'a';
            csf[index]++;
        }

        int n = words.length;
        for(int i = 1; i < n; i++){
            int curr[] = new int[26];
            String currWord = words[i];
            for(char ch : currWord.toCharArray()){
                int index = ch - 'a';
                curr[index]++;
            }

            for(int j = 0; j < 26; j++){
                csf[j] = Math.min(csf[j], curr[j]);
            }
        }

        List<String> res = new ArrayList<>();

        for(int j = 0; j < 26; j++){
            if(csf[j] != 0){
                char ch = (char)(j + 97);
                int count = csf[j];
                while(count > 0){
                    res.add("" + ch);
                    count--;
                }
            }
        }

        return res;
    }
}