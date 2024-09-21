class Solution {
    public boolean isPowerOfFour(int n) {
        int zeros=0;
        int ones=0;
        int k;
        while(n>0){
            k=n&1;
            if(k==0){
                zeros++;
            }
            else{
                ones++;
            }
            n=n>>1;
        }

        if(zeros%2==0 && ones==1){
            return true;
        }
        else{
            return false;
        }
    }
}
