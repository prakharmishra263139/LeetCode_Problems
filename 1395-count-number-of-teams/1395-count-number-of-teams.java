class Solution {
    public int numTeams(int[] rating) {
      int n = rating.length;
      int count=0;

      for(int mid=1;mid<n-1;mid++){
        int leftCount=0;
            for(int i=0;i<mid;i++){
                if(rating[i]<rating[mid]){
                    leftCount++;
            }
        }

        int rightCount=0;
        for(int i=mid+1;i<n;i++){
            if(rating[i]>rating[mid]){
                rightCount++;
            }
        }

        count  = count+leftCount*rightCount;

        int left = mid-leftCount;
        int right =n-mid-1-rightCount;

        count = count+left*right;

      }

      return count;
    }
}