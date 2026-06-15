class Solution {
    public double myPow(double x, int n) {
        long N=n;
        if(n<0){
            x=1/x;
            N=-N;
        }
        return power(x,N);
    }
    public double power(double x,long n){
        if(n==0)return 1;
        double halfpow=power(x,n/2);
        double halfpowsq=halfpow*halfpow;
        if(n%2!=0){
          halfpowsq=x*halfpow*halfpow;  
        }
        // double xnm1=power(x,n-1);
        // double xn=x*xnm1;
        return halfpowsq;
    }
}