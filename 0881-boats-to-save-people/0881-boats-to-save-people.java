class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int left=0;
        int right = people.length-1;
        int boat=0;

        while(left<=right){
            if((left!=right) && (people[right]+people[left]<=limit)){
                left++;
            }
            right--;
            boat++;
        }

        return boat;
    }
}