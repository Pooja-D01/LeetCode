import java.math.BigInteger;

class Solution {
    public int[] plusOne(int[] digits) {
        String val = "";
        for (int d : digits) {
            val = val + d;
        }
        BigInteger num = new BigInteger(val);
        BigInteger plusOne = num.add(BigInteger.ONE);
        String pluse = plusOne.toString();
        int[] arr = new int[pluse.length()];
        for (int i = 0; i < pluse.length(); i++) {
            arr[i] = pluse.charAt(i) - '0';
        }
        return arr;
    }
}
