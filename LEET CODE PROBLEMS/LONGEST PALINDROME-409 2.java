class Solution {
    public int longestPalindrome(String s) {

        int[] arr1=new int[58];
        char temp;
        int index;
        int count_palin=0;
        int count_rem=0;

        for(int i=0;i<s.length();i++){

            temp=s.charAt(i);
            index=temp-'A';
            arr1[index]++;

        }

        for(int i=0;i<arr1.length;i++){
 
            if(arr1[i]%2==0){
                count_palin+=arr1[i];
            }

            else{
                count_palin+=arr1[i]-1;
                count_rem=1;
            }
        }

    return count_palin+count_rem;
        
    }
}