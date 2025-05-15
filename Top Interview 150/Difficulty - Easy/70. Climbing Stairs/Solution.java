

class Solution{
    public static void main(String[] args){
        int n = 3;

        int res = climbStairs(n);

        System.out.println("rez: " + res);
    }

    public static int climbStairs(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        if(n == 2) return 2;
        
        int[] memoArr = new int[n+1];
        
        int res = climbStairsDynamic(n, memoArr);

        return res;
    }

    public static int climbStairsDynamic(int n, int[] memoArr){
        // System.out.println("Ovo je za n: " + n + ", a niz je: " + Arrays.toString(memoArr));
        if (memoArr[n] != 0) return memoArr[n];

        int result;

        if(n == 1 || n == 0){
            return 1;
        }else{
            result = climbStairsDynamic(n-1, memoArr) + climbStairsDynamic(n-2, memoArr); 
            memoArr[n] = result;
        }

        return memoArr[n];
    }
}