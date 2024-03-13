class Solution {
    public int pivotInteger(int n) {
        int i = 1, j = n, result = -1;
        int leftSum = 0, rightSum = 0;
        while (i <= j) {
            if (rightSum > leftSum) {
                leftSum = leftSum + i;
                i++;
            } else if (leftSum > rightSum) {
                rightSum = rightSum + j;
                j--;
            } else {
                leftSum = leftSum + i;
                rightSum = rightSum + j;
                if (i == j) {
                    result = i;
                }
                i++;
                j--;
            }
        }
        return result;
    }
}
