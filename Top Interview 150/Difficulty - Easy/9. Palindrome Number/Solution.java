class Solution {
    public static void main(String[] args){
        int x = 121;

        boolean res = isPalindrome(x);

        System.out.println("rez je: " + res);
    }

    public static boolean isPalindrome(int x){
        //sporo
        // if(x < 0) return false;
        // if(x == 0) return true;

        // String tempX = Integer.toString(x);
        // StringBuilder sb = new StringBuilder();

        // return tempX.equals(sb.append(tempX).reverse().toString());

        if(x < 0) return false;
        if(x == 0) return true;

        int tempX = x;
        int res = 0;

        while(tempX >= 10){
            res += tempX%10;
            tempX = tempX/10;
            res *= 10;
        }
        res += tempX;

        return res == x;
    }
}