class Solution {
    public int romanToDecimal(String s) {
        int total=0;
        int prev=0;
        for(int i=s.length()-1;i>=0;i--){
            int curr=getvalue(s.charAt(i));
            if(curr<prev){
                total-=curr;
            }else{
                total+=curr;
            }
            prev=curr;
        }
        return total;
        
    }
    public static int getvalue(char c){
        if(c=='I'){
            return 1;
        }else if(c=='V'){
            return 5;
        }else if(c=='X'){
            return 10;
        }else if(c=='L'){
            return 50;
        }else if(c=='C'){
            return 100;
        }else if(c=='D'){
            return 500;
        }else {
            return 1000;
        }
        
    }
    
}