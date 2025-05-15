
import java.util.HashMap;

class Solution {
    public static void main(String[] args) {
        int[] nums = {1,0,1,1};
        int k = 1;
        boolean result;

        result = containsNearbyDuplicate(nums, k);

        System.out.println("Result is: " + result);
    }  
    
    public static boolean containsNearbyDuplicate(int[] nums, int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int tempIdx;

        for(int i=0; i < nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], i);
            }else{
                tempIdx = map.get(nums[i]);
                if(Math.abs(tempIdx - i) <= k){
                    return true;
                }else{
                    map.put(nums[i], i);
                }
            }
        }
        return false;
    }
}
