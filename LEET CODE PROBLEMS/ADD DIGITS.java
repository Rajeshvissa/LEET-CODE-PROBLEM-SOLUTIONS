class Solution {
    public int addDigits(int num) {

        int sum=0;

        while(num>0){

            sum=sum+num%10;
            num=num/10;

             if(num==0 && sum>=10){
                num=sum;
                sum=0;
            }


        }

        return sum;
        
    }
}