class Solution {
    public String reversePrefix(String s, int k) {
        String str="";
        int i = k-1;
        while(i>=0){
            str+=s.charAt(i);
            i--;
        }
        while(k<s.length()){
            str+=s.charAt(k++);
        }
        return str;
    }
}