
import java.util.ArrayList;
import java.util.List;

class Solution {
    public static void main(String[] args){
        int[] nums = {0,2,3,4,6,8,9};
        List<String> res;

        res = summaryRanges(nums);

        System.out.println(res);
    }

    public static List<String> summaryRanges(int[] nums){
        //moze optimizovanije al okej je
        List<String> resList = new ArrayList<>();
        boolean hasStarted = false;
        String temp = "";
        for (int i = 0; i < nums.length; i++) {
            if(!hasStarted){
                if(i+1 < nums.length && nums[i+1]-1 == nums[i]){
                    hasStarted = true;
                    temp += nums[i] + "->";
                }else{
                    temp += nums[i];
                    resList.add(temp);
                    temp = "";
                }
            }

            if(i+1 == nums.length){
                if(hasStarted){
                    temp += nums[i];
                    resList.add(temp);
                    return resList;
                }
            }else{
                if(nums[i+1]-1 != nums[i] && hasStarted){
                    hasStarted = false;
                    temp += nums[i];
                    resList.add(temp);
                    temp = "";
                }
            }
        }

        return resList;
    }
}
