class Solution {
    public int getLucky(String s, int k) {
        int sum = 0;

        // Convert letters and calculate the first digit sum
        for (char c : s.toCharArray()) {
            int value = c - 'a' + 1;

            while (value > 0) {
                sum += value % 10;
                value /= 10;
            }
        }

        // Perform remaining transformations
        for (int i = 1; i < k; i++) {
            int temp = 0;

            while (sum > 0) {
                temp += sum % 10;
                sum /= 10;
            }

            sum = temp;
        }

        return sum;
    }
}