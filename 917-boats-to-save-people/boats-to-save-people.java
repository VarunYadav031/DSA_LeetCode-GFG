class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i=0;
        int j=people.length-1;
        int boatcnt=0;
        while(i<j){
            int sum=people[i]+people[j];
            if(sum<=limit){
                boatcnt++;
                i++;
                j--;

            }else {
                j--;
                boatcnt++;

            }
        }
        if(i==j){
            boatcnt++;
        }
return boatcnt;
    }
}