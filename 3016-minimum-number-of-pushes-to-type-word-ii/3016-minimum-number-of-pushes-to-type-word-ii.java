class Solution {
    public int minimumPushes(String word) {
        int array[]=new int[26];
        for(char c:word.toCharArray())
        {
            array[c-'a']++;
        }
        Arrays.sort(array);
        int ind=1,sum=0,count=1;
        for(int i=25;i>=0;i--)
        {
            if(ind<=8)
            {
                ind++;
            }
            else
            {
                ind=2;
                count++;
            }
            sum=sum+(array[i]*count);
        }
        return sum;
    }
}