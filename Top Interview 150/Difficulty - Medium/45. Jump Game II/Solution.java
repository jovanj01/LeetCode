class Solution {
    public static void main(String[] args){
        int[] nums = {2,3,0,1,4};

        int res = jump(nums);

        System.out.println("rez je: " + res);
    }

    public static int jump(int[] nums){
        if (nums.length == 1) return 0;
        if (nums.length == 2) return 1;
        
        int counter = 0;
        int currentIndex = 0;
        int currentMax = currentIndex+1;
        
        while(true){
            if(currentIndex == nums.length -1) return counter;
            if(nums[currentIndex] + currentIndex >= nums.length -1){
                counter++;
                return counter;
            }

            for (int i = currentIndex+1; i <= currentIndex + nums[currentIndex]; i++) {
                if(nums[i] + i >= nums.length -1){
                    counter+=2;
                    return counter;
                }
                
                if(nums[currentMax] + currentMax <= nums[i] + i){
                    currentMax = i;
                }

            }
            currentIndex = currentMax;
            counter++;

            if(nums[currentIndex] + currentIndex >= nums.length -1){
                counter++;
                return counter;
            }

            currentMax = currentIndex + 1;
        } 
    }
}