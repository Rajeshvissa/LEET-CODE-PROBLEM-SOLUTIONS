public class Solution {
    public String solve(String A) {
        
      
        
        String [] arr1= A.split(" ");
      
        String ans="";
        
        
        
        for(int i=arr1.length-1;i>=0;i--){
            
            if(arr1[i].equals(" ")){
                
                continue;
            }
            
            else{
                
                if(i!=arr1.length-1 && !arr1[i].equals("")){
                ans=ans+" ";
                }
                
                ans=ans+arr1[i];
                
                
            }
        }
        
        return ans;
        
        
    }
}
