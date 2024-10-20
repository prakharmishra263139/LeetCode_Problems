class Solution {
    public int reverse(int x) {
    long answer=0;
    while(x!=0){
        long dig = x%10;
        answer = answer*10+dig;
        x = x/10;
        if(answer>Integer.MAX_VALUE ||answer<Integer.MIN_VALUE)
         return 0;
    }
    return (int)answer;
    }
}