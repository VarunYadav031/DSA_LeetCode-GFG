// User function Template for Java

class Solution {
    public int maximumProfit(int prices[]) {
        // Code here
        int n=prices.length;
        int minprice=Integer.MAX_VALUE;
        int max=0;
        for(int price:prices){
            if(price<minprice){
                minprice=price;
            }else{
                max=Math.max(max,price-minprice);
            }
        }
        return max;
    }
}