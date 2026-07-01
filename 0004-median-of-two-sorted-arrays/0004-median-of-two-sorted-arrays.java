// class Solution {
//     public double findMedianSortedArrays(int[] nums1, int[] nums2) {
//         int n = nums1.length;
//         int m= nums2.length;
//         int sort[]=new int[n+m];
//         int i=0;
//         int j=0;
//         int k=0;
//         while(i<n && j<m){
//             if(nums1[i]<nums2[j]){
//                 sort[k]=nums1[i];
//                 i++;
//             }else{
//                 sort[k]=nums2[j];
//                 j++;
//             }
//             k++;
//         }
//         while(i<n){
//             sort[k]=nums1[i];
//             i++;
//             k++;
//         }
//         while(j<m){
//             sort[k] = nums2[j];
//             j++;
//             k++;
//         }
//         int size = sort.length;
//         if(size%2 == 0){
//             int s1 = size/2;
//             float sum = (float)(sort[s1]+sort[s1-1])/2;
//             return sum;
//         }
//         return sort[size/2];
//     }
// }

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int totalLength = n + m;
        int mid = totalLength / 2;

        int i = 0, j = 0;
        int count = 0;
        int curr = 0, prev = 0;

        while (count <= mid) {
            prev = curr;
            if (i < n && (j >= m || nums1[i] < nums2[j])) {
                curr = nums1[i];
                i++;
            } else {
                curr = nums2[j];
                j++;
            }
            count++;
        }

        if (totalLength % 2 == 0) {
            return (prev + curr) / 2.0;
        }
        return curr;
    }
}
