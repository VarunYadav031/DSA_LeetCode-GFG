class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder sb=new StringBuilder();
        int i=num1.length()-1;
        int j=num2.length()-1;
        int carry=0;
        while(i>=0 || j>=0 || carry!=0){
            int s1=0;
            int s2=0;
            if(i>=0){
                s1=num1.charAt(i)-'0';
            
            }
            if(j>=0){
                s2=num2.charAt(j)-'0';
            }
            int sum=s1+s2+carry;
            sb.append(sum%10);
            carry=sum/10;
            i--;
            j--;

        }
        return sb.reverse().toString();
    }
}