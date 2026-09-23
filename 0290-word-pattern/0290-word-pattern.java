class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> mp = new HashMap<>();
        HashMap<String,Character> reverse = new HashMap<>();
        String[] str = s.split(" ");
        if(pattern.length()!=str.length) return false;
        for(int i=0;i<str.length;i++){
            char a = pattern.charAt(i);
            String s1 = str[i];
            if(mp.containsKey(a) && !mp.get(a).equals(s1)) return false;
            if(reverse.containsKey(s1) && !reverse.get(s1).equals(a)) return false;
            mp.put(a,s1);
            reverse.put(s1,a);
        }
        return true;
    }
}