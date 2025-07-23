import java.math.BigInteger;
class Solution {
    public int[] plusOne(int[] digits) {
        String val="";
        for(int i=0;i<digits.length;i++){
            val=val+digits[i];
        }
        BigInteger a=new BigInteger(val);
        BigInteger sum=a.add(BigInteger.ONE);
        String s=String .valueOf(sum);
        int[] arr = new int[s.length()];
        for(int i=0;i<s.length();i++){
            arr[i]=s.charAt(i)-'0';
        }
        return arr;
    }
}