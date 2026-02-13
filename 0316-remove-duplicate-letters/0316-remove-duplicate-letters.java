class Solution {
    public String removeDuplicateLetters(String s) {
        int last[] = new int[26];
        for(int i=0;i<s.length();i++){
            last[s.charAt(i)-'a'] = i;
        }
        Stack<Character> st = new Stack<>();
        int vis[] = new int[26];
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(vis[ch-'a'] == 1) continue;
            while(!st.isEmpty() && ch < st.peek() && last[st.peek()-'a'] > i){
                vis[st.pop()-'a'] = 0;
            }
            st.push(ch);
            vis[ch-'a'] = 1;
        }
        StringBuilder s1 = new StringBuilder();
        for(char ch:st){
            s1.append(ch);
        }
        return s1.toString();
    }
}