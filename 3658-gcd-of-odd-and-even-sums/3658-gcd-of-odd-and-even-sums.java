class Solution {
    public int helper_gcd(int a,int b){
        if(b==0){
            return a;
        }
        return helper_gcd(b,a%b);
    }
    public int gcdOfOddEvenSums(int n) {
        int num1 = 1;
        int oddsum = 0,evensum = 0;
        for(int i=0;i<n;i++){
            if(num1%2!=0){
                 oddsum += num1;
                  num1 = num1+2;
            }
        }
        int num2=2;
        for(int i=0;i<n;i++){
            if(num2%2==0){
                 evensum += num2;
                  num2 = num2+2;
            }
        }
        System.out.println(oddsum +" "+evensum);
        return helper_gcd(oddsum,evensum);
    }
}