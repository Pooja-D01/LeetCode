class Solution {
    public int addDigits(int num) {
        int val = num;
        while (val >= 10) {
            val = add(val);  
        }
        return val;
    }

    int add(int num) {
        int sum = 0;
        while (num > 0) {
            int n = num % 10;
            sum += n;
            num = num / 10;
        }
        return sum;
    }
}
