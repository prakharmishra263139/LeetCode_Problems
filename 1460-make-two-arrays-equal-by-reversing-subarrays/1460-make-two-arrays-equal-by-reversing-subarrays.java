class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        if (target.length != arr.length) {
            return false;
        }

        Arrays.sort(target);
        Arrays.sort(arr);

        int startTarget = 0;
        int arrStart = 0;

        while (startTarget < target.length && arrStart < arr.length) {
            if (target[startTarget] != arr[arrStart]) {
                return false;
            }
            startTarget++;
            arrStart++;
        }

        return true;
    }
}