class Solution {
    public String reverseStr(String s, int k) {

        char[] str = s.toCharArray();

        for (int start = 0; start < str.length; start += 2 * k) {

            int left = start;
            int right = Math.min(start + k - 1, str.length - 1);

            while (left < right) {
                char temp = str[left];
                str[left] = str[right];
                str[right] = temp;

                left++;
                right--;
            }
        }

        return new String(str);
    }
}