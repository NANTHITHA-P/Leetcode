class Solution {
    public String decodeString(String s) {
        Stack<Integer> s1 = new Stack<>();
        Stack<StringBuilder> s2 = new Stack<>();
        int num = 0;
        StringBuilder cs = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(Character.isDigit(ch)){
                num = num *10 +(ch-'0');
            }
            else if(ch=='['){
                s1.push(num);
                s2.push(cs);
                num = 0;
                cs = new StringBuilder();
            }
            else if(ch==']'){
                int n = s1.pop();
                StringBuilder temp = new StringBuilder();
                StringBuilder prev = new StringBuilder();
                for(int i=0;i<n;i++){
                    temp.append(cs);
                }
                if(!s2.isEmpty()){
                    prev = s2.pop();
                }
                prev.append(temp);
                cs = prev;
            }
            else{
                cs.append(ch);
            }
        }
        return cs.toString();
    }
}