class Solution {
    public int minBitFlips(int start, int goal) {

        int result=0;
        int k1;
        int k2;

        while(start>0 || goal>0){
            
            k1=start&1;
            k2=goal&1;
            if(k1!=k2){
                result++;
            }

            start=start>>1;
            goal=goal>>1;

        }

        return result;
        
    }
}
