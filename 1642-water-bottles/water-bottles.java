class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
      int drank=numBottles;
      while(numBottles>=numExchange){
        int Exchange=numBottles/numExchange;
        int ExtraEmpty=numBottles%numExchange;
        drank +=Exchange;
        numBottles=Exchange+ExtraEmpty;
      }  
      return drank;
    }
}