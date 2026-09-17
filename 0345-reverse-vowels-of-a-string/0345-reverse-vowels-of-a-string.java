class Solution {
    public boolean isVowel(char ch){
        return ch == 'a' || ch =='e'||ch == 'i'||ch =='o'||ch == 'u' || ch=='A'|| ch =='E'||ch == 'I'||ch == 'O'||ch == 'U';
    }
    public String reverseVowels(String str) {
        int left = 0,right = str.length()-1;
        char[] s = str.toCharArray();
        while(left<right){
            while(left<right && !isVowel(s[left])){
                left++;
            }
            while(left<right && !isVowel(s[right])){
                right--;
            }
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp; 
            left++;
            right--; 
        }
        return new String(s);
    }
}