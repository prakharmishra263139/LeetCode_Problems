import java.util.HashMap;

class Solution {
    public int beautifulSubsets(int[] nums, int k) {
        return find(nums, k, 0, new HashMap<>()); 
    }

    public int find(int[] nums, int k, int index, HashMap<Integer, Integer> mp) {
        if (index == nums.length) {
            if (mp.size() == 0) {
                return 0;
            } else {
                return 1;
            }
        }
        int pick = 0;
        int ele1 = nums[index] + k;
        int ele2 = nums[index] - k;

        if (mp.size() == 0 || (!mp.containsKey(ele1) && !mp.containsKey(ele2))) {
            mp.put(nums[index], mp.getOrDefault(nums[index], 0) + 1);

            pick = find(nums, k, index + 1, mp);

            mp.put(nums[index], mp.get(nums[index]) - 1);

            if (mp.get(nums[index]) == 0) {
                mp.remove(nums[index]);
            }
        }
        int notPick = find(nums, k, index + 1, mp);

        return pick + notPick;
    }
}
