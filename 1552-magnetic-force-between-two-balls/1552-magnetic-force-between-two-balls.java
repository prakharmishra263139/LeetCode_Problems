class Solution {
    public boolean isPossible(int min,int position[], int m){
        int placed=1;
        int last = position[0];

        for(int i=1;i<position.length;i++){
            if(position[i]-last>=min){
                placed++;
                last=position[i];
            }

            if(placed>=m){
                return true;
            }
        }

        return false;


    }
    public int maxDistance(int[] position, int m) {

        if(m>position.length){
            return -1;
        }
        Arrays.sort(position);
        int n = position.length;
        int start=1;
        int end = position[n-1]-position[0];
        int ans=0;

        while(start<=end){
            int mid = start+(end-start)/2;
            if(isPossible(mid,position,m)){
                ans= mid;
                start=mid+1;
            }else{
                end = mid-1;
            }
        }

        return ans;
    }
}