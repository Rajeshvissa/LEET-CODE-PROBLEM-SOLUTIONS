class Solution {
    public int longestSubarray(int[] nums) {
        int sub_array=0;
        int max_value=nums[0];
        int curr;
        int max_array=0;

       for(int i=1;i<nums.length;i++){
        if(max_value<nums[i]){
            max_value=nums[i];
        }
    } 

       for(int i=0;i<nums.length;i++){
            curr=nums[i];
            if(curr==max_value){
                sub_array++;
            }
            else{
                   sub_array=0;
            }
            max_array=Math.max(max_array,sub_array);

       }
       return max_array;

     
        
    }
}
