class Solution {
    public static void main(String[] args) {
        int[] nums = {2,3,3};
        int majElem = majorityElement(nums);

        System.out.println("Majority element: " + majElem);
    }   

    public static int majorityElement(int[] nums) {
        // Boyer-Moore Majority Vote Algorithm

        int numLen = nums.length;
        int majorityElem = Integer.MIN_VALUE;
        int counter = 0;
        

        for(int i = 0; i < numLen; i++){
            if (majorityElem == Integer.MIN_VALUE){
                majorityElem = nums[i];
            }

            if (majorityElem == nums[i]){
                counter++;
            }else{
                counter--;
            }

            if(counter == 0){
                majorityElem = Integer.MIN_VALUE;
            }
        }

        return majorityElem;
    }
}
