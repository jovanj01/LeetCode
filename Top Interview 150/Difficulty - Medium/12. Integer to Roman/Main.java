public class Main{
    public static void main(String[] args){
        int num = 3749;
        Solution solution = new Solution();
        String res = solution.intToRoman(num);

        System.out.println(res);
    }
}

class Solution {
    public String intToRoman(int num){
        StringBuilder sb = new StringBuilder();
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanNumerals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        for (int i = 0; i < values.length; i++) {
            if (num == 0) break;

            while(num >= values[i]){
                num -= values[i];
                sb.append(romanNumerals[i]);
            }
        }
        
        return sb.toString();
    }
}