
import java.util.HashSet;





class Solution {
    public static void main(String[] args){
        int n = 19;
        boolean result;

        result = isHappy(n);
        System.out.println("Happy number: " + result);
    }

    public static boolean isHappy(int n){
        //Radi ali je neoptimizovano
        // int sum;
        // HashSet<Integer> map = new HashSet<>();
        // if(n <= 0){
        //     return false;
        // }

        // sum = n;

        // while (true) {
            
        //     if(map.contains(sum)){
        //         return false;
        //     }else{
        //         map.add(sum);
        //     }

        //     char[] numbers = Integer.toString(sum).toCharArray();

        //     sum = 0;

        //     for (Character ch : numbers) {
        //         sum = sum + Integer.parseInt(ch.toString())*Integer.parseInt(ch.toString());
        //     }

        //     if(sum == 1){
        //         return true;
        //     } 
        // }
        
        int sum = 0;
        HashSet<Integer> set = new HashSet<>();

        while(sum != 1 && !set.contains(sum)){
            set.add(sum);
            sum = 0;

            while (n!=0) {
                sum += Math.pow(n%10, 2);
                n/=10;
            }

            n = sum;
        }
        return sum == 1;

    }
}
