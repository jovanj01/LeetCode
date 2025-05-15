import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int k;

        k = removeDuplicates(nums);

        System.out.println("K je: " + k);
        System.out.println(Arrays.toString(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int k = 1;
        int numsLen = nums.length;
        int lastImportantIndex = 0;

        if (numsLen == 0) {
            return 0;
        }

        for (int i = 1; i < numsLen; i++) {
            if(nums[i] != nums[i-1] && nums[i] != nums[lastImportantIndex]){
                k++;
                nums[lastImportantIndex+1] = nums[i];
                lastImportantIndex++;
            }else if(nums[i] == nums[i-1] || nums[i] == nums[lastImportantIndex]){
                nums[i] = Integer.MIN_VALUE;
            }
        }
        
        return k;
    }
}
