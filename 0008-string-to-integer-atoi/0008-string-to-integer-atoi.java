class Solution {
    public int myAtoi(String s) {
        int i = 0, n = s.length();
        long res = 0;
        int sign = 1;
        while (i < n && s.charAt(i) == ' ') i++;
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }
        while (i < n && Character.isDigit(s.charAt(i))) {
            int val = s.charAt(i) - '0';
            res = res * 10 + val;
            if (sign == 1 && res >= Integer.MAX_VALUE) 
                return Integer.MAX_VALUE;
            if (sign == -1 && -res <= Integer.MIN_VALUE)
                return Integer.MIN_VALUE;
            i++;
        }
        return (int)(res * sign);
    }
}