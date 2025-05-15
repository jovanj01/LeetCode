class Solution {
    public static void main(String[] args) {
        int n = (int) Long.parseLong("00000010100101000001111010011100", 2);

        int res = reverseBits(n);

        System.out.println(res);
    }

    public static int reverseBits(int n) {
        int res = 0;
        for(int i=0; i < 32; i++){
            res = res << 1;
            if((n&1) == 1){
                res = res|1;
            }
            n = n >> 1;
        }

        return res;
    }
}