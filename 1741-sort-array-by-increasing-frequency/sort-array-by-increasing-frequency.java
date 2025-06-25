import java.util.*;

class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            if (map.containsKey(n)) {
                map.put(n, map.get(n) + 1);
            } else {
                map.put(n, 1);
            }
        }

        List<Integer> list = new ArrayList<>();
        for (int n : nums) {
            list.add(n);
        }

        Collections.sort(list, (a, b) -> {
            int f1 = map.get(a);
            int f2 = map.get(b);
            if (f1 != f2) {
                return f1 - f2;
            } else {
                return b - a;
            }
        });

        int[] ans = new int[nums.length];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }
}
