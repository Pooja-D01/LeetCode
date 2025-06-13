class Solution {
    public String reverseVowels(String s) {
        int i=0;
        int j=s.length()-1;
        char[]arr=s.toCharArray();
        ArrayList <Character> list=new ArrayList<>(Arrays.asList('A','E','I','O','U','a','e','i','o','u'));
        while(i<j){
            if(list.contains(arr[i]) && list.contains(arr[j])){
                char temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
            else if(!list.contains(arr[i])){
                i++;
            }
            else{
                j--;
            }
        }
        return String.valueOf(arr);
    }
}