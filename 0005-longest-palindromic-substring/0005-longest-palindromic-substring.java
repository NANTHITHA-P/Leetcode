class Solution {
    public String longestPalindrome(String s) {
       if(s==null || s.length()<2){
        return s;
       }
       int start = 0,end = 0;
       for(int i=0;i<s.length();i++){
          int len1 = expand(s,i,i);//finding odd length string is palindrome
          int len2 = expand(s,i,i+1);//finding even length string is palindrome
          int len = Math.max(len1,len2);
          if(len > end - start){//to consider only longest palindromic substring
            start = i - (len-1)/2; //here we are considering i is at centre position i - (len-1)/2 this will give value before i ,len-1 because indexing starts from 0
            end = i + len/2;// here i is at centre position i_len/2 gives value after i
          }
       }
       return s.substring(start,end+1); 
    }
    public int expand(String s,int left,int right){
        while(left>=0 && right<s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }
}