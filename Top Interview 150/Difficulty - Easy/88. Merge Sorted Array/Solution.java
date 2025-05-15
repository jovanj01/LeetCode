
import java.util.Arrays;


class Solution {
    public static void main(String[] args) {
        int[] nums1 = {0};
        int[] nums2 = {1};
        int nums1_len = 0;
        int nums2_len = 1;
        
        merge(nums1, nums1_len, nums2, nums2_len);
        System.out.println(Arrays.toString(nums1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n){
   
        /*PRAVILNO RESENJEi to big O(m+n), a moje je O(n*(m+n)): 
         * 
        int i = m - 1; // poslednji validan element u nums1
        int j = n - 1; // poslednji element u nums2
        int k = m + n - 1; // poslednja pozicija u nums1

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        // ako ostanu elementi u nums2 (u slučaju da su svi manji od nums1 elemenata)
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
        */


        if(n == 0) {
            return;
        }

        if(m == 0){
            System.arraycopy(nums2, 0, nums1, 0, n);
            return;
        }

        int temp1, temp2;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m+n; j++) {
                if(nums1[j] >= nums2[i]){
                    temp1 = nums1[j];
                    nums1[j] = nums2[i]; 
                    for (int k = 1; k < m+n-j; k++) {
                        temp2 = nums1[k+j];
                        nums1[k+j] = temp1;
                        temp1 = temp2;
                    }
                    break;
                }

                if (j > m && nums1[j] == 0){
                    nums1[j] = nums2[i];
                    break;
                }
            }
        }
        
    }    
}
