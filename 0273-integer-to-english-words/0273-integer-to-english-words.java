class Solution {
    private final String[] below20 = {
        "", "One", "Two", "Three", "Four", "Five", "Six",
        "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve",
        "Thirteen", "Fourteen", "Fifteen", "Sixteen",
        "Seventeen", "Eighteen", "Nineteen"
    };

    private final String[] tens = {
        "", "", "Twenty", "Thirty", "Forty",
        "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };
    public String helper(int num){
        if(num < 20) return below20[num]+" ";
        if (num < 100) {
        if (num % 10 == 0)
            return tens[num / 10] + " ";

        return tens[num / 10] + " " + helper(num % 10);
    }
        if (num < 1000) {
    if (num % 100 == 0)
        return helper(num / 100) + "Hundred ";

    return helper(num / 100) + "Hundred " + helper(num % 100);
}
        if (num < 1000000) {
    if (num % 1000 == 0)
        return helper(num / 1000) + "Thousand ";

    return helper(num / 1000) + "Thousand " + helper(num % 1000);
}
        if (num < 1000000000) {
    if (num % 1000000 == 0)
        return helper(num / 1000000) + "Million ";

    return helper(num / 1000000) + "Million " + helper(num % 1000000);
}
        return helper(num/1000000000) + "Billion " + helper(num%1000000000);
    }
    public String numberToWords(int num) {
        if(num == 0) return "Zero";
        return helper(num).trim();
    }
}