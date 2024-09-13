class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {

        int [] arr1=new int[arr.length/2];
        int n=arr.length-1;
        int flag1=0;
        int flag2=0;
        int first;
        int end;
        if(arr.length%2!=0){
            n=arr.length-1;
        }
        int diff;
        int ind=0;
        int [] result=new int[queries.length];
        for(int i=0;i<n && arr.length!=1;i=i+2){
            arr1[ind]=arr[i]^arr[i+1];
            ind++;
        }
        for(int i=0;i<queries.length;i++){
            flag1=0;
            flag2=0;
                diff=queries[i][1]-queries[i][0];
                if(diff==0){
                    result[i]=arr[queries[i][1]];
                }

                else if(diff==1){
                    result[i]=arr[queries[i][1]]^arr[queries[i][0]];
                }

                else{
                    first=queries[i][0];
                    end=queries[i][1];

                    if(queries[i][0]%2!=0){
                        flag1=first;
                        first=queries[i][0]+1;
                    }
                    if(queries[i][1]%2==0){
                        flag2=end;
                        end=queries[i][1]-1;
                    }
                    for(int k=first/2;k<=(end/2);k++){
                        result[i]=result[i]^arr1[k];
                    }

                    if(flag1!=0){
                        result[i]=result[i]^arr[flag1];
                    }

                    if(flag2!=0){
                        result[i]=result[i]^arr[flag2];
                    }
                }
        }

        return result;
        
    }
}