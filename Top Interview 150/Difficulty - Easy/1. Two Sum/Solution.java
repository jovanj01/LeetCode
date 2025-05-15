
import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public static void main(String[] args){
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] res;
        
        res = twoSum(nums, target);

        System.out.println("Result: " + Arrays.toString(res));

    }

    public static int[] twoSum(int[] nums, int target){
        //radi ali moze optimizovanije
        // int[] res = new int[2];

        // for (int i = 0; i < nums.length; i++) {
        //     for (int j = i+1; j < nums.length; j++) {
        //         if(target == nums[i]+nums[j]){
        //             res[0] = i;
        //             res[1] = j;
        //             return res;
        //         }
        //     }
        // }

        // return res;

        HashMap<Integer, Integer> map = new HashMap<>();
        int complement;

        for (int i = 0; i < nums.length; i++) {
            complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[] {map.get(complement), i};
            }else{
                map.put(nums[i], i);
            }
        }

        return new int[] {0,0};
    }
}
