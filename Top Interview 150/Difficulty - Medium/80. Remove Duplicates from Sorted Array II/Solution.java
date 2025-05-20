


class Solution {
    public static void main(String[] args){
        int[] nums = {0,0,1,1,1,1,2,3,3};
        //            1 1 2 2 * *

        int k = removeDuplicates(nums);

        System.out.println("K iznosi: " + k);
    }

    public static int removeDuplicates(int[] nums){
        //Radi ali beats 22%
        // int i = 1;
        // int k = 1;
        // int sameCounter = 1;
        // int currentNum = nums[0];
        // int importantIndex = -1;

        // if (nums.length == 0) return 0;

        // while (i < nums.length){
        //     if(currentNum != nums[i]){
        //         currentNum = nums[i];
        //         k++;
        //         sameCounter = 1;
        //         if(importantIndex != -1 && nums[importantIndex] == Integer.MIN_VALUE){
        //             nums[importantIndex] = nums[i];
        //             nums[i] = Integer.MIN_VALUE;
        //             importantIndex++;
        //         }
        //     }else{
        //         sameCounter++;
        //         if(sameCounter == 2){
        //             k++;
        //             if(importantIndex != -1 && nums[importantIndex] == Integer.MIN_VALUE){
        //                 nums[importantIndex] = nums[i];
        //                 nums[i] = Integer.MIN_VALUE;
        //                 importantIndex++;
        //             }
        //         }else if(sameCounter == 3){
        //             nums[i] = Integer.MIN_VALUE;
        //             // importantIndex = i;
        //             if(importantIndex != -1){
        //                 importantIndex = Math.min(importantIndex, i);
        //             }else{
        //                 importantIndex = i;
        //             }
        //         }else if(sameCounter > 3){
        //             nums[i] = Integer.MIN_VALUE;
        //         }
        //     }

        //     i++;
        // }
        // return k;


        //zapravo je logika slicna mojoj da se pamti prvi indeks koji je los i uporedjujem njegova dva mesta unazad sa trenutnim indeksom kroz koji iteriram. Ako je razl samo pomeris poslednji bitan indeks u jedan za desno a na njegovo mesto pises bitan novi element
        if (nums.length <= 2) {
            return nums.length;
        }

        int left = 2;

        for (int right = 2; right < nums.length; right++) {
            if (nums[right] != nums[left - 2]) {
                nums[left] = nums[right];
                left++;
            }
        }
        return left;
    }
}