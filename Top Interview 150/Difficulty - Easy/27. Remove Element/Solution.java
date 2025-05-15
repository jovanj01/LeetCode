
import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        int k = removeElement(nums, val);
        System.out.println("Ovo je k: " + k);
        // System.out.println(Arrays.toString(nums));
    }

    public static int removeElement(int[] nums, int val) {
        int k=0;
        int num_len = nums.length;

        for (int i = 0; i < num_len; i++) {
            if(nums[i] == val){
                nums[i] = Integer.MIN_VALUE;
            }else{
                k++;
            }
        }

        int goodElemIndex = 0;
        
        for (int i = 0; i < num_len; i++) {
            if(nums[i] == Integer.MIN_VALUE){
                while (nums[goodElemIndex] == Integer.MIN_VALUE && goodElemIndex < num_len - 1){
                    goodElemIndex++;
                }
                nums[i] = nums[goodElemIndex];
                nums[goodElemIndex] = Integer.MIN_VALUE;
            }else{
                goodElemIndex++;
            }
        }

        System.out.println(Arrays.toString(nums));
        return k;
    }
}