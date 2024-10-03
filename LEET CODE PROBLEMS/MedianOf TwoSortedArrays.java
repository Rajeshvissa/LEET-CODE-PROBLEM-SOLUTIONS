class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        if(m==0 && n==0){
            return 0;
        }
        int[] arr=new int[n+m];
        int point1=0;
        int point2=0;
        int ind=0;
        while(point1<n && point2<m){
            if(nums1[point1]<=nums2[point2]){
                arr[ind]=nums1[point1];
                point1++;
            }
            else{
                arr[ind]=nums2[point2];
                point2++;
            }
            ind++;
        }
        if(point1<n){
            for(int i=point1;i<n;i++){
                arr[ind]=nums1[i];
                ind++;
            }
        }
        else{
            for(int i=point2;i<m;i++){
                arr[ind]=nums2[i];
                ind++;
            }
        }

        if((n+m)%2==0){
            ind=(((n+m)-1)/2);
            return (((double)arr[ind]+(double)arr[ind+1])/2);
        }
        else{
            ind=((n+m)-1)/2;
            return (double)arr[ind];
        }
        
        
    }
}
