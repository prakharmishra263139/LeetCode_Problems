class Solution {
    public int numIdenticalPairs(int[] nums) {
    HashMap<Integer,Integer>answer=new HashMap<>();
   
    int result =0;
        for(int num :nums){
              if(answer.containsKey(num)){
                int k = answer.get(num);
                result += k;
                answer.put(num,k+1);
            } else{
                   answer.put(num,1);
            }    
        }
        return result;
        
    }
}