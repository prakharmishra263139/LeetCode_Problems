class Solution {
    public int countVowelStrings(int n) {
        int a,e,i,o,u;
        a=e=i=o=u=1;
        int count=0;

        for(int j=1;j<n;j++){
            a=a+e+i+o+u;
            e = e+i+o+u;
            i=i+o+u;
            u=o+u;
            u=u;
        }
        count =a+e+i+o+u;
        return count ;
    }
}