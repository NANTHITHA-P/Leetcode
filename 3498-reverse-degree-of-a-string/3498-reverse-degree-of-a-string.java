class Solution {
    public int get(char ch){
        if(ch=='a') return 26;
        if(ch=='b') return 25;
        if(ch=='c') return 24;
        if(ch=='d') return 23;
        if(ch=='e') return 22;
        if(ch=='f') return 21;
        if(ch=='g') return 20;if(ch=='h') return 19;if(ch=='i') return 18;if(ch=='j') return 17;if(ch=='k') return 16;if(ch=='l') return 15;if(ch=='m') return 14;if(ch=='n') return 13;if(ch=='o') return 12;if(ch=='p') return 11;if(ch=='q') return 10;if(ch=='r') return 9;if(ch=='s') return 8;if(ch=='t') return 7;if(ch=='u') return 6;if(ch=='v') return 5;if(ch=='w') return 4;if(ch=='x') return 3;if(ch=='y') return 2;return 1;
    }
    public int reverseDegree(String s) {
        int res = 0 ;
        for(int i=0;i<s.length();i++){
            res+=get(s.charAt(i))*(i+1);
        }
        return res;
    }
}