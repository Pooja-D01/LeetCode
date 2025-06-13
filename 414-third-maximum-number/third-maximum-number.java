import java.util.*;

class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        for (int i = nums.length - 1; i >= 0; i--) {
            if (set.add(nums[i])) { // set.add returns false if already present
                list.add(nums[i]);
            }
        }

        if (list.size() < 3) {
            return list.get(0); // max
        }
        return list.get(2); // 3rd max
    }
}
