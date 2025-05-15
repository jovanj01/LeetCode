import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[] digits = {9};
        
        int[] res = plusOne(digits);

        System.out.println("rez je: " + Arrays.toString(res));
    }

    public static  int[] plusOne(int[] digits){
        if (digits.length == 0) return null;

        if(digits[digits.length-1] != 9){
            digits[digits.length-1]++;
            return digits;
        }else {
            int i = digits.length - 1;
            int remainder = 0;
            while (i >= 0){
                if (digits[i] == 9) {
                    digits[i] = 0;
                    remainder = 1;
                }else{
                    digits[i]++;
                    remainder--;
                    break;
                }
                i--;
            }

            if(remainder == 0){
                return digits;
            }else{
                int[] newArray = new int[digits.length+1];
                newArray[0] = 1;

                System.arraycopy(digits, 0, newArray, 1, digits.length);

                return newArray;
            }
        }
    }
}