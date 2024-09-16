class Solution {
    public int findMinDifference(List<String> timePoints) {

        int[] times=new int[timePoints.size()];
        int hour;
        int val;
        int min_value=Integer.MAX_VALUE;
        int curr_mint;
        for(int i=0;i<timePoints.size();i++){
            hour=Integer.parseInt(timePoints.get(i).substring(0,2));
            val=hour*60+Integer.parseInt(timePoints.get(i).substring(3,5));
            times[i]=val;
        }
        Arrays.sort(times);
        for(int i=1;i<times.length;i++){
            curr_mint=times[i]-times[i-1];
            min_value=Math.min(min_value,curr_mint);
            if(i==times.length-1){
                curr_mint=times[i]-times[0];
                curr_mint=Math.abs((24*60)-curr_mint);
                 min_value=Math.min(min_value,curr_mint);
            }
        }
        return min_value;
        
    }
}
