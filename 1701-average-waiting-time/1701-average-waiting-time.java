class Solution {
    public double averageWaitingTime(int[][] customers) {
        int time=1;
        long waiting=0;

        for(int cust[]:customers){
            if(time<=cust[0]){
                time = cust[0]+cust[1];
            }else{
                time = time+cust[1];
            }
         waiting += (time-cust[0]);
        }

        double average = (waiting/(double)customers.length);

        return average;

    }
}