class Solution {
    public static void main(String[] args){
        int[] nums = {4,2,0,0,1,1,4,4,4,0,4,0};

        boolean result = canJump(nums);

        System.out.println("Result is: " + result);
    }

    public static boolean canJump(int[] nums) {
        int currentIndex = 0;
        int currentMax; 
        int i = 0;

        if(nums.length == 1) return true;
        if(nums[currentIndex] == 0) return false;

        while (i < nums.length) {
            if(nums[currentIndex] == 0) return false;

            while(currentIndex + 1 < nums.length && nums[currentIndex] < nums[currentIndex + 1] && nums[currentIndex] != 0){
                currentIndex = currentIndex + 1;
            }

            if(currentIndex == nums.length-1 || currentIndex + nums[currentIndex] >= nums.length - 1){
                return true;
            }

            if(nums[currentIndex] > 1){
                currentMax = currentIndex+1;
                for (int j = currentIndex + 1; j <= nums[currentIndex] + currentIndex; j++) {
                    if(nums[currentMax] + currentMax <= nums[j] + j){
                        currentMax = j;
                    }
                }
                currentIndex = currentMax;
            }else{
                currentIndex++;
            }

            i++;
        }

        return false;
    }
}