class Solution {
    public String reverseWords(String s) {
        String str[] = s.split(" ");
        String res = "";
        for(int i=0;i<str.length;i++){
            String word = "";
            for(int j=str[i].length()-1;j>=0;j--){
                word+=str[i].charAt(j);
            }
            res+=word;
            if(i!=str.length-1){
                res+=" ";
            }
        }
        return res;
    }
}