class Solution {
    public int maxProfit(int[] prices) {
        int min_price = Integer.MAX_VALUE;
        int max = 0;
        for(int val : prices){
            min_price = Math.min(val,min_price);
            max = Math.max(max,val-min_price);
        }
        return max;
    }
}