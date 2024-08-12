class Solution {
    public int longestPalindrome(String s) {

        HashMap<String,Integer>map1=new HashMap<>();
        String temp;
        int count_palin=0;
        int count_rem=0;
        int k;

        for(int i=0;i<s.length();i++){

            temp=s.charAt(i)+"";
            

            if(map1.containsKey(temp)){
                 k=map1.get(temp);
                map1.put(temp,k+1);
            }

            else{
                map1.put(temp,1);
            }
            
        }

        for(int i=0;i<s.length();i++){

            temp=s.charAt(i)+"";
            k=map1.get(temp);

            if(k%2==0){
                count_palin+=k;
                
            }

            else{
                count_palin+=(k/2)*2;
                count_rem+=k%2;
                
            }

             map1.put(temp,0);
        }

        if(count_rem>0){
            return count_palin+1;
        }

        else{
            return count_palin;
        }
        
    }
}