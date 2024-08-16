class Solution {
    public boolean isPowerOfTwo(int n) {

        int temp=n;

        if(temp<=0){

            return false;
        }

        while(temp>1){

            if(temp%2==0){

                temp=temp/2;
            }

            else{

                return false;
            }
        }

        return true;
        
    }
}