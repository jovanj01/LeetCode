class Solution {
    public static void main(String[] args){
        int[] nums = {1,3,5,6};
        int target = 7;

        int res = searchInsert(nums, target);

        System.out.println("rez je idx = " + res);
    }

    public static int searchInsert(int[] nums, int target){
        int left = 0, right = nums.length - 1;

        int candidate=-1;

        while (left <= right){
            int middle = left + (right - left) / 2;
            if(nums[middle] == target){
                return middle;
            }else if(nums[middle] > target){
                right = middle - 1;
                candidate = middle;
            }else{
                left = middle + 1;
                candidate = middle+1;
            }
        }

        return candidate;
    }
}