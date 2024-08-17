class Solution {
    public int reverse(int x) {

        int flag=0;
        int reverse=0;
        int rem=0;
        int confirm=0;
        int possible=0;


        if(x<0){

            flag=1;
        }

        x=Math.abs(x);

        

        while(x>0){

            rem=x%10;
            

           if(confirm==1){
            return 0;
           }

           else if(possible==1 && rem>7){

            return 0;

           }

           reverse=(reverse*10)+rem;


           if(reverse>(Integer.MAX_VALUE/10)){

            confirm=1;
           }

           else if(reverse==(Integer.MAX_VALUE/10)){

            possible=1;
           }

            x=x/10;
            
        }

        if(flag==1){

            return -1*reverse;
        }

        else{

            return reverse;
        }
        
    }
}
