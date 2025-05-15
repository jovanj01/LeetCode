class Solution{
    public static void main(String[] args){
        int x = 2147395599;

        int res = mySqrt(x);

        System.out.println("koren iznosi: " + res);
    }

    public static int mySqrt(int x){ 
        if (x == 0) return 0;
        int l = 0;
        int r = x/2 + 1;
        int middle;

        while (l <= r) {
            middle = l + (r-l)/2; 
            long square = (long) middle * middle;
            if(square == x){
                return middle;
            }else if(square > x){
                r = middle - 1; 
            }else{
                long nextSquare = (long) (middle + 1) * (middle + 1);
                if(nextSquare > x){
                    return middle;
                }
                l = middle + 1; 
            }
        }
        
        return -1;
    }
}