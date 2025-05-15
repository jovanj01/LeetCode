class Solution {
    public static void main(String[] args){
        int n = 11;

        int res = hammingWeight(n);

        System.out.println("res je: " + res);
    }

    public static int hammingWeight(int n){
        // ovo je 1ms
        // int sum=0, counter=0, j=0;
        // int nTemp = n;
        // while (sum != nTemp) {
        //     if((n&1) == 1){
        //         counter++;
        //         sum += Math.pow(2, j);
        //     }
        //     n = n >> 1;
        //     j++;
        // }

        // return counter;

        //ovo je 0ms, jbg bitwise operacije su uvek najbrze
        int counter=0, j=0;
        while (j < 32) {
            if((n&1) == 1){
                counter++;
            }
            n = n >> 1;
            j++;
        }

        return counter;
    }
}