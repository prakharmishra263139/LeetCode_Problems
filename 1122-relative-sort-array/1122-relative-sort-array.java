class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        
        int max=0;
        int n=arr1.length;
        int m =arr2.length;

        for(int i=0;i<n;i++){
            max = Math.max(max,arr1[i]);
        }
        int count[]= new int[max+1];

        for(int i=0;i<n;i++){
            int ele  = arr1[i];
            count[ele]++;
        }
        int res[]= new int[n];

        int j=0;

        for(int i=0;i<m;i++){
        int ele  = arr2[i];
        while(count[ele]>0){
           res[j]=ele;
           j++;
           count[ele]--;
        }
    }

    for(int i=0;i<max+1;i++){
        while(count[i]>0){
           res[j]=i;
           j++;
           count[i]--;
        }
    }

    return res;
  }
}