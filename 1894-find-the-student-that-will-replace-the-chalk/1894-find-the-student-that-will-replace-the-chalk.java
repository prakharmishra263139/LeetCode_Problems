class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        
        int n = chalk.length;

        long sum=0;

        for(int i=0;i<n;i++){
            sum=sum+chalk[i];
        }

        long remain = k%sum;

        for(int i=0;i<n;i++){
            if(chalk[i]>remain){
                return i;
            }else {
           remain = remain-chalk[i];
        }}

        return 0;
    }
}