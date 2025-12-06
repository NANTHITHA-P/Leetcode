class Solution {
    public boolean isPalindrome(String s) {
        String s1 = s.toLowerCase();
        String s2="",s3="";
        for(int i=0;i<s1.length();i++){
            if(Character.isLetterOrDigit(s1.charAt(i))){
                s2+=s1.charAt(i);
            }
          }
        for(int i=s2.length()-1;i>=0;i--){
            s3+=s2.charAt(i);
        }
        return s2.equals(s3);
    }
}