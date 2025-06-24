class Solution {
    public String largestOddNumber(String num) {
        String result = "";

        // If the last digit is odd, return the full number
        if ((num.charAt(num.length() - 1) - '0') % 2 != 0) {
            return num;
        } else {
            for (int i = 0; i < num.length(); i++) {
                if ((num.charAt(i) - '0') % 2 != 0) {
                    result = num.substring(0, i + 1);
                }
            }
        }
        return result;
    }
}
