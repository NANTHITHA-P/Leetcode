class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{'){
                st.push(ch);
            }
            if(ch == ')' || ch == ']' || ch == '}'){
                char pop = st.pop();
               if((pop == '(' && ch != ')') || (pop == '[' && ch != ']') || (pop == '{' && ch != '}')) return false;
            }
        }
        return st.isEmpty();
    }
}