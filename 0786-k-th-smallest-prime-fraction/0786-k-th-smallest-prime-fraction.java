class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        PriorityQueue<double[]> pq = new PriorityQueue<>(new Comparator<double[]>(){
            public int compare(double arr1[],double arr2[]){
                if(arr1[0]<=arr2[0]){
                    return -1;
                }else{
                    return 1;
                }
            }
        });
        
        int n  =arr.length;
        for(int i=0;i<n-1;i++){
            double prime = 1.0*arr[i]/arr[n-1];
            pq.offer(new double[]{prime,i,n-1});
        }

        int res[] = new int[2];

        while(k>0){
            double val[] = pq.poll();
            int numeratorIndex = (int)val[1];
            int denominatorIndex = (int)val[2];
            int next=denominatorIndex-1;

            if(numeratorIndex<denominatorIndex){
                double prime = 1.0*arr[numeratorIndex]/arr[next];
                pq.offer(new double[]{prime,numeratorIndex,next});
            }
            k--;
            if(k==0){
                res[0]= arr[numeratorIndex];
                res[1]=arr[denominatorIndex];
            }
        }
return res;
    }
}