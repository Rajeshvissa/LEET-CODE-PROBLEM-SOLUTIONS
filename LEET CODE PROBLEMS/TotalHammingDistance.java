class Solution {
    public int totalHammingDistance(int[] nums) {
        int result=0;
        int ones=0;
        int zeroes=0;
        for(int i=0;i<32;i++){
            ones=0;
            zeroes=0;
            for(int j=0;j<nums.length;j++){
                if((nums[j]&(1<<i))>0){
                    ones++;
                }
                else{
                    zeroes++;
                }
            }
            result+=ones*zeroes;
        }
        return result;
    }
}
