class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if(n == 0) return n;
        int max = 0;
        int day = prices[0];
        for(int  i = 1 ; i< n ;i++){
            if(prices[i] < day ){
                day = prices[i];
            }else{
                max =  Math.max(max ,prices[i]-day);
            } 
        } 
        return max;
    }
}