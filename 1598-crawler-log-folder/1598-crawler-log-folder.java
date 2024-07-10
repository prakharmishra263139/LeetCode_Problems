class Solution {
    public int minOperations(String[] logs) {
        int levels=0;

        for(String log : logs){
            if(log.equals("../")){
                if(levels!=0){
                    levels--;
                }
            }else if(log.equals("./")){
                continue;
            }else{
                levels++;
            }
        }

        return levels;
    }
}