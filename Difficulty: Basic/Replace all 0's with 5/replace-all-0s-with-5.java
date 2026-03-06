class Solution {
    int convertfive(int num) {
        if (num==0)return 5;
       int newnum=0;
       int place=1;
    
        while(num>0){
            int d=num%10;
            if(d==0){
                d=5;
            }
            newnum=newnum+d*place;
            place *=10;
            num=num/10;
        }
        return newnum;
    }
}