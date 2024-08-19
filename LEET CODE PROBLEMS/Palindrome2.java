class Solution {
    public boolean isPalindrome(int x) {

        int copy=x;

        if(x<0){
            return false;
        }

        if(x%10==0 && x!=0){
            return false;
        }

        int reverse=0;

        while(x>0){
            reverse=reverse*10+x%10;
            x/=10;
        }
        
        return reverse==copy;
        
    }
}
