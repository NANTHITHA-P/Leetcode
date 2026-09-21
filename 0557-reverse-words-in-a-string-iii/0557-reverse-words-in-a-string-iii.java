class Solution {
    public String reverseWords(String s) {
        String[] str = s.split(" ");
        for(int i=0;i<str.length;i++){
            int left = 0 ,right = str[i].length()-1;
            char[] ch = str[i].toCharArray();
            while(left<right){
                char temp = ch[left];
                ch[left] = ch[right];
                ch[right] = temp;
                left++;
                right--;
            }
            str[i] = new String(ch);
        }
        String res = "";
        for(int i=0;i<str.length;i++){
            res+=str[i];
            if(i!=str.length-1){
                res+=" ";
            }
        }
        return res;
    }
}