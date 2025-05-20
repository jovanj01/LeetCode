import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public static void main(String[] args){
        int[] nums = {1,2,3,4};
        //            

        int[] res = productExceptSelf(nums);

        System.out.println(Arrays.toString(res));
    }

    public static int[] productExceptSelf(int[] nums){
        int[] answers = new int[nums.length];
        HashMap<Integer,Integer> pairs = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if(!pairs.containsKey(nums[i])){
                answers[i] = 1;
                for (int j = 0; j < nums.length; j++) {
                    if(j != i){
                        answers[i] *= nums[j];
                    }
                }
                pairs.put(nums[i], answers[i]);
            }else{
                answers[i] = pairs.get(nums[i]);
            }
        }

        return answers;
    }
}