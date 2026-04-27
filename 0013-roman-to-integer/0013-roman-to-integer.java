class Solution {
    public int romanToInt(String str) {
        int[] n = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] s = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int i=0,j=0,res=0;
        while(i<str.length()){
            if(i+1<str.length()){
                String s1 = str.substring(i,i+2);
                if(s1.equals(s[j])){
                    res += n[j];
                    i+=2;
                    continue;
                }
            }
            String s2 = str.substring(i,i+1);
            if(s2.equals(s[j])){
                res+=n[j];
                i+=1;
            }
            else{
                j++;
            }
        }
        return res;
    }
}