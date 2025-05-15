class Solution{
    public static void main(String[] args){
        int[] nums = {2,2,1};

        int res = singleNumber(nums);

        System.out.println("rezzz: " + res);
    }

    public static int singleNumber(int[] nums){
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result = result ^ nums[i];
        }

        return result;
    }
}