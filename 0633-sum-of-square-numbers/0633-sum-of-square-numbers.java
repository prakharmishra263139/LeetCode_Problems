class Solution {
    public boolean judgeSquareSum(int c) {
        long leftCount = 0;
        long rightCount = (long)Math.sqrt(c);
    while (leftCount <= rightCount) {
        long ans = leftCount*leftCount +rightCount *rightCount;
            if (ans == c) {
              return true;
            } else if (ans <c) {
                   leftCount++;
            } else {
               rightCount--;
            }
        }
return false;
    }
}