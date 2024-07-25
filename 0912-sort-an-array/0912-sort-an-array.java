class Solution {
    public static void merge(int nums[], int low, int mid, int high){
        ArrayList<Integer> list = new ArrayList<>();

        int left = low;
        int right = mid + 1;

        while(left <= mid && right <= high){
            if(nums[left] <= nums[right]){
                list.add(nums[left]);
                left++;
            } else {
                list.add(nums[right]);
                right++;
            }
        }

        while(left <= mid){
            list.add(nums[left]);
            left++;
        }

        while(right <= high){
            list.add(nums[right]);
            right++;
        }

        for(int i = low; i <= high; i++){
            nums[i] = list.get(i - low);
        }
    }

    public static void mergeSort(int nums[], int low, int high){
        if(low >= high){
            return;
        }
        int mid = (low + high) / 2;
        mergeSort(nums, low, mid);
        mergeSort(nums, mid + 1, high);
        merge(nums, low, mid, high);
    }

    public int[] sortArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return nums;
        }
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }
}
