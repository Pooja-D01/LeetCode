class Solution {
    public String reverseWords(String s) {
        String[] arr = s.strip().split(" ");
        for(int i=0;i<arr.length;i++){
             char[] arr1 = arr[i].toCharArray();
            int a=0;
            int b=arr1.length - 1;
            while(a<b){
                char temp=arr1[a];
                arr1[a]=arr1[b];
                arr1[b]=temp;
                a++;
                b--;
            }
            arr[i] = new String(arr1);
        }
        return String.join(" ", arr);
    }
}