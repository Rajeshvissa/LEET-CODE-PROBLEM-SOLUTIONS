class Solution {


    static boolean isPrime(int num){
            
            int k=2;

            while(k*k<=num){

                if(num%k==0){
                    return false;
                }

                k++;
            }

            return true;
    }
    public boolean isUgly(int n) {

        if(n==0){
            return false;
        }

        if(n==1){
            return true;
        }

        if(n<0){
            return false;
        }

        int i=1;

        while(i*i<=n){

            if(n%i==0){

                if(isPrime(i) && i>5){
                    return false;
                }

                if(isPrime(n/i) && (n/i)>5){
                return false;
            }

               
            }

            i++;
        }

        return true;
        
    }
}
