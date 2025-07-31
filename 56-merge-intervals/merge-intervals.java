class Solution {
    public int[][] merge(int[][] intervals) {
        //sorting 
        for(int i=0;i<intervals.length-1;i++){
            int flag=0;
            for(int j=0;j<intervals.length-1;j++){
                if(intervals[j][0]>intervals[j+1][0]){
                    //swap
                    int temp[]=new int[2];
                    temp[0]=intervals[j][0];
                    temp[1]=intervals[j][1];
                    intervals[j][0]=intervals[j+1][0];
                    intervals[j][1]=intervals[j+1][1];
                    intervals[j+1][0]=temp[0];
                    intervals[j+1][1]=temp[1];
                    flag=1;
                }
            }
            if(flag==0){
                break;
            }
        }
        List<int[]>res=new ArrayList<>();
        int curr_interval[]=intervals[0];
        res.add(curr_interval);
        for(int i=0;i<intervals.length;i++){
            if(intervals[i][0]<=curr_interval[1]){
                curr_interval[1]=Math.max(curr_interval[1],intervals[i][1]);
            }else{
                curr_interval=intervals[i];
                res.add(curr_interval);
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}