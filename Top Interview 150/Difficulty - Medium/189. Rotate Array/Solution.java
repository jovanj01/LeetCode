import java.util.Arrays;

class Solution {
    public static void main(String[] args){
        int k = 3;
        int[] nums = {1,2,3,4,5,6,7};

        rotate(nums, k);
        System.out.println(Arrays.toString(nums));
    }

    public static void rotate(int[] nums, int k){
        // Ovo radi ali je time limit exceeded ako je input ogroman niz
        // int temp1;
        // int temp2;
        // int j=0;

        // while (k != 0) {
        //     temp1 = nums[0];
        //     while(j < nums.length) {
        //         if(j == nums.length-1){
        //             temp2 = nums[j];
        //             nums[nums.length-1] = temp1;
        //             nums[0] = temp2;
        //         }else{
        //             temp2 = nums[j];
        //             nums[j] = temp1;
        //             temp1 = temp2;
        //         }
        //         j++;
        //     } 
        //     j = 0;
        //     k--;
        // }
        k = k % nums.length;

        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
    }

    public static int[] reverse(int[] nums, int a, int b){
        int temp;
        while(a<b){
            temp = nums[a];
            nums[a] = nums[b];
            nums[b] = temp;
            a++;
            b--;
        }

        return nums;
    }
}