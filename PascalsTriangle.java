class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>>result=new ArrayList<>();
        int k;
        for(int i=0;i<numRows;i++){
            List<Integer>list1=new ArrayList<>();
            if(i==0){
                list1.add(1);
            }
            else{
                list1.add(1);
                list1.add(1);
                k=1;
                while(k<i){
                    list1.add(k,result.get(i-1).get(k)+result.get(i-1).get(k-1));
                    k++;
                }
            } 
            result.add(i,list1);
        }
        return result;
    }
}
