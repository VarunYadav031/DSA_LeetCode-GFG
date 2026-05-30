class Solution {
    String removeSpaces(String s) {
        char[] arr=s.toCharArray();
        int idx=0;
        for(int i=0;i<s.length();i++){
            if(arr[i]!=' '){
                arr[idx]=arr[i];
                idx++;
            }
        }
        return new String(arr,0,idx);
    }
}