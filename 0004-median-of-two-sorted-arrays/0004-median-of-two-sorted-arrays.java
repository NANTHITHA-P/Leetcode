class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] merge = new int[n1+n2];

        System.arraycopy(nums1,0,merge,0,n1);
        System.arraycopy(nums2,0,merge,n1,n2);
        
        Arrays.sort(merge);
        int len = merge.length;

        if(len%2==0){
            return (merge[len/2 -1] + merge[len/2])/2.0;
        }
        else{
            return merge[len/2];
        }
   
    }
}