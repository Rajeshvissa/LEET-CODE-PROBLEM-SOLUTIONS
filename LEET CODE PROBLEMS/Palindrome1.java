class Solution {
    public boolean isPalindrome(int x) {

        if(x<0){
            return false;
        }

        String copy=Integer.toString(x);

        int first=0;
        int last=copy.length()-1;

        while(first<last){

            if(!(copy.charAt(first)==copy.charAt(last))){
                
                return false;
            }

            first++;
            last--;
        }

        return true;
        
    }
}
