// User function Template for Java

class Solution {
    static boolean isLeap(int N) {
       if(N%4==0 && N%100!=0){            //2024,2000,1900
           return true;
       }
        if(N%400==0){   // for century year 2000,1900
            return true;
        }
        return false;
    }
}